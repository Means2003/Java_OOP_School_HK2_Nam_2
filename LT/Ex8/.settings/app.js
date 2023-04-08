const form = document.querySelector('.login-form');
const usernameInput = document.getElementById('username');
const passwordInput = document.getElementById('password');
const submitButton = document.getElementById('submit-btn');

form.addEventListener('submit', function(event) {
	event.preventDefault();
	const username = usernameInput.value.trim();
	const password = passwordInput.value.trim();

	if (username === '' || password === '') {
		alert('Please enter your username and password.');
		return;
	}

	// Here you would normally send an AJAX request to the server to check the username and password
	// and retrieve the user's information if the login is successful.
	// For the sake of simplicity, we will just log the user's credentials to the console.
	console.log(`Username: ${username}\nPassword: ${password}`);
});

const getRadi0 =getElementById("nu")