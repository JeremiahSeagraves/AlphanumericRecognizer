var getJSON = function () {
    $.ajax({
        url: "/hello", context: document.body,
        success: function (salutation) {
            alert("Did something");
            var $helloH1 = $("#hello");
            $helloH1.append(salutation);
        }, error: function (data) {
            alert("Did not do something");
        }
    })
};

getJSON();

