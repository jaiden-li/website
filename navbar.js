fetch('/navbar.html')
  .then(response => response.text())
  .then(data => {
    const placeholder = document.getElementById('navbar-placeholder');
    if (placeholder) {
      placeholder.innerHTML = data;
    }
  });
