$(function() {
  function successFunction(...data) {
    console.log(data)
  }

  function errorFunction(...error) {
    console.log(error)
  }

  $('#form').on('submit', function(event) {
    event.preventDefault();

    // FormData 객체를 생성합니다.
    var formData = new FormData(this);

    var data = {};

    for (var pair of formData.entries()) {
      data[pair[0]] = pair[1];
    }

    var jsonData = JSON.stringify(data);

    $.ajax({
      method: 'post',
      url: '/api/boards/',
      contentType : 'application/json; charset=utf-8',
      data: jsonData,
      processData: false,
      success: successFunction,
      error: errorFunction
    })


  })
})
