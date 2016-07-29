Meta:

Narrative:
As a user
I want to perform a search on google
So that I can see the results and do some other things

Scenario: searching for stuff with the examples
Given the user is on the google home page
When the user searches for <searchTerm>
Then they should see the wikipedia article for <searchResult>

Examples:
searchTerm  | searchResult
bananas     | Banana
higgs boson | Higgs boson

Scenario: searching for stuff from a csv file
Given the search data from GoogleScenarios.csv
When the user does some special search
Then they should see the appropriate stuff
