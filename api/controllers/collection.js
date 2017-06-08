'use strict';
// Include our "db"
var db = require('../../config/collectionDb')();
// Exports all the functions to perform on the db
module.exports = {getAllCollections, saveCollection, getOneCollection, updateCollection, delCollection};

//GET /collection operationId
function getAllCollections(req, res, next) {
  res.json({ collections: db.find()});
}
//POST /collection operationId
function saveCollection(req, res, next) {
    res.json({success: db.save(req.body), description: "Collection added to the list!"});
}
//GET /collection/{id} operationId
function getOneCollection(req, res, next) {
    var id = req.swagger.params.id.value; //req.swagger contains the path parameters
    var collection = db.find(id);
    //need to update this response for collection
    if(collection) {
        var col = {};
        col["collection"] = collection;
        res.json(col);
    }else {
        res.status(204).send();
    }
}
//PUT /collection/{id} operationId
function updateCollection(req, res, next) {
    var id = req.swagger.params.id.value; //req.swagger contains the path parameters
    var collection = req.body;
    if(db.update(id, collection)){
        res.json({success: 1, description: "Collection updated!"});
    }else{
        res.status(204).send();
    }

}
//DELETE /collection/{id} operationId
function delCollection(req, res, next) {
    var id = req.swagger.params.id.value; //req.swagger contains the path parameters
    if(db.remove(id)){
        res.json({success: 1, description: "Location deleted!"});
    }else{
        res.status(204).send();
    }
}
