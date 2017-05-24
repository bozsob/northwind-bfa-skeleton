$(document).ready(function() {

});

function getOrders() {

    $("#cust-and-suppl").hide();
    $("#invoice").hide();
    $("#total").hide();
    $("#order").show();
    $.ajax({
        url: "/order",
        type: "get",
        success: function (data) {
            $("#order").empty();
            console.log(data);
            var htmlString = "<table><tr>" +
                "<th>OrderID</th>" +
                "<th>ProductID</th>" +
                "<th>Product Name</th>" +
                "<th>Unit Price</th>" +
                "<th>Quantity</th>" +
                "<th>Discount</th>" +
                "<th>Total</th></tr>";

            data.forEach(function(o) {
                htmlString += "<tr><td>" + o.orderID + "</td>" +
                    "<td>" + o.productID + "</td>" +
                    "<td>" + o.productName + "</td>" +
                    "<td>" + o.unitPrice + "</td>" +
                    "<td>" + o.quantity + "</td>" +
                    "<td>" + o.discount + "</td>" +
                    "<td>" + o.total + "</td>";
            });
            htmlString += "</table>";
            $("#order").append(htmlString);
        }
    })
}

function getCustomersAndSuppliers() {

    $("#order").hide();
    $("#invoice").hide();
    $("#total").hide();
    $("#cust-and-suppl").show();
    $.ajax({
        url: "/customersAndSuppliers",
        type: "get",
        success: function (data) {
            $("#cust-and-suppl").empty();
            console.log(data);
            var htmlString = "<table><tr>" +
                "<th>City</th>" +
                "<th>Company Name</th>" +
                "<th>Contact Name</th>" +
                "<th>Relationship</th></tr>";

            data.forEach(function(d) {
                htmlString += "<tr><td>" + d.city + "</td>" +
                    "<td>" + d.companyName + "</td>" +
                    "<td>" + d.contactName + "</td>" +
                    "<td>" + d.relationship + "</td>";
            });
            htmlString += "</table>";
            $("#cust-and-suppl").append(htmlString);
        }
    })
}

function getDataToInvoice() {

    $("#order").hide();
    $("#cust-and-suppl").hide();
    $("#total").hide();
    $("#invoice").show();

    $.ajax({
        url: "/invoice",
        type: "get",
        success: function (data) {
            $("#invoice").empty();
            console.log(data);
            var htmlString = "<table><tr>" +
                "<th>ShipName</th>" +
                "<th>ShipAddress</th>" +
                "<th>ShipCity</th>" +
                "<th>ShipRegion</th>" +
                "<th>ShipPostalCode</th>" +
                "<th>ShipCountry</th>" +
                "<th>CustomerID</th>" +
                "<th>CustomerName</th>" +
                "<th>Address</th>" +
                "<th>City</th>" +
                "<th>Region</th>" +
                "<th>PostalCode</th>" +
                "<th>Country</th>" +
                "<th>Salesperson</th>" +
                "<th>OrderID</th>" +
                "<th>OrderDate</th>" +
                "<th>RequiredDate</th>" +
                "<th>ShippedDate</th>" +
                "<th>ShipperName</th>" +
                "<th>ProductID</th>" +
                "<th>ProductName</th>" +
                "<th>UnitPrice</th>" +
                "<th>Quantity</th>" +
                "<th>Discount</th>" +
                "<th>Total</th>" +
                "<th>Freight</th></tr>";

            data.forEach(function(i) {
                htmlString += "<tr><td>" + i.shipName+ "</td>" +
                    "<td>" + i.shipAddress + "</td>" +
                    "<td>" + i.shipCity + "</td>" +
                    "<td>" + i.shipRegion + "</td>" +
                    "<td>" + i.shipPostalCode + "</td>" +
                    "<td>" + i.shipCountry + "</td>" +
                    "<td>" + i.customerID + "</td>" +
                    "<td>" + i.customerName + "</td>" +
                    "<td>" + i.address + "</td>" +
                    "<td>" + i.city + "</td>" +
                    "<td>" + i.region + "</td>" +
                    "<td>" + i.postalCode + "</td>" +
                    "<td>" + i.country + "</td>" +
                    "<td>" + i.salesperson + "</td>" +
                    "<td>" + i.orderID + "</td>" +
                    "<td>" + i.orderDate + "</td>" +
                    "<td>" + i.requiredDate + "</td>" +
                    "<td>" + i.shippedDate + "</td>" +
                    "<td>" + i.shipperName + "</td>" +
                    "<td>" + i.productID + "</td>" +
                    "<td>" + i.productName + "</td>" +
                    "<td>" + i.unitPrice + "</td>" +
                    "<td>" + i.quantity + "</td>" +
                    "<td>" + i.discount + "</td>" +
                    "<td>" + i.total + "</td>" +
                    "<td>" + i.freight + "</td>";
            });
            htmlString += "</table>";
            $("#invoice").append(htmlString);
        }
    })
}

function getTotalOrders() {

    $("#cust-and-suppl").hide();
    $("#order").hide();
    $("#invoice").hide();
    $("#total").show();
    $.ajax({
        url: "/orderTotal",
        type: "get",
        success: function (data) {
            $("#total").empty();
            console.log(data);
            var htmlString = "<table><tr>" +
                "<th>OrderID</th>" +
                "<th>Total</th></tr>";

            data.forEach(function(o) {
                htmlString += "<tr><td>" + o.orderID + "</td>" +
                    "<td>" + o.total + "</td>";
            });
            htmlString += "</table>";
            $("#total").append(htmlString);
        }
    })
}

function getTotalIncome() {

    $("#sales").show();
    $("#cust-and-suppl").hide();
    $("#order").hide();
    $("#invoice").hide();
    $("#total").hide();
    $.ajax({
        url: "/totalIncome",
        type: "get",
        success: function (data) {
            console.log(data);
            var htmlString = "<table><tr>" +
                "<th>ProductName</th>" +
                "<th>CategoryName</th>" +
                "<th>ShipYear</th>" +
                "<th>Total</th></tr>";

            data.forEach(function(o) {
                htmlString += "<tr><td>" + o.productName + "</td>" +
                    "<td>" + o.categoryName + "</td>" +
                    "<td>" + o.shipYear + "</td>" +
                    "<td>" + o.total + "</td>";
            });
            htmlString += "</table>";
            $("#sales").append(htmlString);
        }
    })
}
