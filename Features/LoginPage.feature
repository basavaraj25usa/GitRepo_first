Feature: LoginPage
Scenario: Login with valid credentials
		Given Launch the browser
		When Browse URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
		When Enter Email as "admin@yourstore.com"
		When Enter Password as "admin"
		When Click Login
		Then User logs in successfully