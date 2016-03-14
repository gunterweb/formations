'use strict';

/**
 * @ngdoc function
 * @name springApp.controller:CustomerCtrl
 * @description
 * # CustomerCtrl
 * Controller of the springApp
 */
 springApp.controller('CustomerCtrl', function ($scope, $filter, CustomerService, ngTableParams) {
	$scope.formData = {};
	loadCustomers($scope);
  	$scope.saveCustomer = function() {
  		//console.log("Creating " + $scope.formData.newCustomer.name + " with id " + $scope.formData.newCustomer.idCustomer);
  		CustomerService.addCustomer($scope.formData.newCustomer, function(response) {
  			alert("Request status : " + response.status +" (" + response.statusText+")"); 			
  		});
  		$scope.formData = {};
  		loadCustomers($scope);
    }  	
  	function loadCustomers($scope) {
  		CustomerService.getCustomers(function(data) {
  	  		$scope.customers = data;
  	  		$scope.customersTable = new ngTableParams({
  	  	        page: 1,
  	  	        count: 9
  	  	    }, {
  	  	        total: $scope.customers.length,
  	  	        getData: function ($defer, params) {
  	  	        	$scope.data = params.sorting() ? $filter('orderBy')($scope.customers, params.orderBy()) : $scope.customers;
  	  	            $scope.data = $scope.data.slice((params.page() - 1) * params.count(), params.page() * params.count());
  	  	            $defer.resolve($scope.data);
  	  	        }
  	  	    });
  	  	});
  	}
});

