'use strict;'

var crypto = require('crypto');

module.exports = function() {
    return {
      locationList: [],

      save(location) {
        location.id = crypto.randomBytes(20).toString('hex');
        this.locationList.push(location);
        return 1;
      },

      find(id) {
        if(id) {
          return this.locationList.find(element => {
            return element.id === id;
          });
        } else {
          return this.locationList; //return full list if id not found
        }
      },

      remove(id) {
        var found = 0;
        this.locationList = this.locationList.filter(element => {
          if(element.id === id) {
            found = 1;
          } else {
            return element.id !== id;
          }
        });
        return found;
      },

      update(id, location) {
        var locationIndex = this.locationList.findIndex(element => {
          return element.id === id;
        });

        if(locationIndex !== -1) {
          this.locationList[locationIndex] = location;
          return 1;
        } else {
          return 0;
        }
      }
    }
};
