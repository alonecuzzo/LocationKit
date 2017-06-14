'use strict';
// Include our "db"
var db = require('../../config/locationDb')();
// Exports all the functions to perform on the db
module.exports = {getAllLocations, saveLocation, getOneLocation, updateLocation, delLocation};

//GET /location operationId
function getAllLocations(req, res, next) {
  res.json({ locations: db.find()});
}
//POST /location operationId
function saveLocation(req, res, next) {
    res.json({success: db.save(req.body), description: "Location added to the list!"});
}
//GET /location/{id} operationId
function getOneLocation(req, res, next) {
    var id = req.swagger.params.id.value; //req.swagger contains the path parameters
    var location = db.find(id);
    if(location) {
        var loc = {};
        loc["location"] = location;
        res.json(loc);
    }else {
        res.status(204).send();
    }
}
//PUT /location/{id} operationId
function updateLocation(req, res, next) {
    var id = req.swagger.params.id.value; //req.swagger contains the path parameters
    var location = req.body;
    if(db.update(id, location)){
        res.json({success: 1, description: "Location updated!"});
    }else{
        res.status(204).send();
    }

}
//DELETE /location/{id} operationId
function delLocation(req, res, next) {
    var id = req.swagger.params.id.value; //req.swagger contains the path parameters
    if(db.remove(id)){
        res.json({success: 1, description: "Location deleted!"});
    }else{
        res.status(204).send();
    }
}
