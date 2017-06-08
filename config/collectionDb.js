'use strict;'

var crypto = require('crypto');

module.exports = function() {
    return {
      collectionList: [],

      save(collection) {
        collection.id = crypto.randomBytes(20).toString('hex');
        this.collectionList.push(collection);
        return 1;
      },

      find(id) {
        if(id) {
          return this.collectionList.find(element => {
            return element.id === id;
          });
        } else {
          return this.collectionList; //return full list if id not found
        }
      },

      remove(id) {
        var found = 0;
        this.collectionList = this.collectionList.filter(element => {
          if(element.id === id) {
            found = 1;
          } else {
            return element.id !== id;
          }
        });
        return found;
      },

      update(id, collection) {
        var collectionIndex = this.collectionList.findIndex(element => {
          return element.id === id;
        });

        if(collectionIndex !== -1) {
          this.collectionList[collectionIndex] = collection;
          return 1;
        } else {
          return 0;
        }
      }
    }
};
