# GSON

## Feature Tasks

The app will be using a provided json file to show random popular book quotes. The app will be using GSON to parse the .json file. The app needs no functionality other than showing the quote and the author when it is run. The app should choose one quote each time it is run.


## Installing dependencies

Using gradle makes life easier, you just need to build the project and everything will be automatically downloaded for you, no need to add dependencies manually.

If you use another build tool you need to add the dependencies manually following the tool's documentations.

## Testing

I used a simple unit test that check if the parsed json list is correct by providing constant variables and asserting equality.