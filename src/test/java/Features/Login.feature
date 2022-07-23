Feature: Application Login

@Test
Scenario Outline: Home Page default login
Given User is on login page
When User provides valid credentials <UN> & <PW> and click on login
Then Hope page is opened
And All the expected details are displayed

Examples:
|US	|PW	|
|ABC	|123	|
|XYZ	|456	|
|ASD	|789	|



