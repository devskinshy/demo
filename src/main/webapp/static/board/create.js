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

    $.ajax({
      method: 'post',
      url: '/api/boards/',
      success: successFunction,
      error: errorFunction
    })
  })
})
