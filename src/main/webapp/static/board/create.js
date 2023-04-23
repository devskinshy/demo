$(function() {


  $('#submitBtn').on('click', function() {
    const data = new FormData($('#form')[0]);
    console.log(data);
  })

  // $.ajax({
  //   url: '/api/boards/',
  //   success: successFunction,
  //   error: function(xhr, status, error) {
  //     console.log(error)
  //   },
  // })
})
