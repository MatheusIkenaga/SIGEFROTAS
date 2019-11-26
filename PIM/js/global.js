function popOpen(janela) {
  if ($(janela).hasClass('open')) {
      $(janela).toggleClass('open');
  } else {
      $(janela).addClass('open');
}
}