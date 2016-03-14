'use strict';

/**
 * @ngdoc function
 * @name springApp.service:CustomerService
 * @description # CustomerService Service of the springApp
 */
angular.module('services', []).factory('CustomerService', function($http) {
	var CustomerService = {};
	CustomerService.getCustomers = function(callback) {
		$http({
			method : 'GET',
			url : 'http://localhost:8180/spring-web/api/customer/'
		}).then(function(response) {
			callback(response.data);
		}, function(response) {
			console.log("Status : " + response.status);
			if (response.data !== undefined) {
				console.log("Erreur : " + response.data.errors);
			}
		});
	};
	CustomerService.addCustomer = function(newCustomer, callback) {
		$http({
			method : 'POST',
			url : 'http://localhost:8180/spring-web/api/customer/',
			data : newCustomer,
		    headers: {
		        "Content-Type": "application/json"}
		}).then(function(response) {
			callback(response.status);
		}, function(response) {			
			if (response.data !== undefined) {				
				console.log("Erreur : " + response.data.errors);
			}
		});					
	};
	return CustomerService;
});