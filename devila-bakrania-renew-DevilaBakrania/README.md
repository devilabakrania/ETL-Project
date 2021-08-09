## Renew Technical Challenge

### Background

Renew is powering the hotelification of the $3T residential rental industry by changing the way renters search, stay, and move their way through apartment networks.

A key technical challenge we have is integrating our software with real estate property management partners ("operators"), so we can build an internal database of their properties and listings to power our web applications. 

### Challenge

For this coding challenge, you'll build a simplified program that normalizes operator real estate data into a consistent format that is more usable by Renew. 

Imagine that Renew currently has only three operators to integrate with: `Operator 1`, `Operator 2` and `Operator 3`. Operator's 1 and 2 use the same underlying system to manage their residential data, but Operator 3 uses a different system - meaning its API signature and response structures are different. In the future, we'll have dozens of different operator systems to integrate with.

You have access to mock APIs for each operator and your challenge is to write a program that pulls data from any of these operator APIs (using a simple command line utility), and outputs it in a "Renew Standard Format", which is just a structured CSV. 

More information about the deliverable, the mock APIs and "Renew Standard Format" is provided below.

### Considerations

* You should approach this like you would any production software project you'd work on with a team and include appropriate documentation, testing, error handling, comments etc.
* That said, we're not expecting more than 3 hours of work, so please make appropriate tradeoffs to get to a working solution within that time - you'll have time in our follow-up session to talk about any trade-offs you had to make and what you might have done with more time.
* The problem is open-ended, but there aren't any tricks or gotchas. Please feel free to make (and state) assumptions, and to ask any questions you have for clarification.

### Deliverable

You can use any tools, frameworks or languages of your choosing, but your solution should implement a simple interface: it should execute using the `run` command line utility, it should require a single argument (the operator's integer identifier), and it should print the resulting CSV to standard out. Examples executions:

```bash
./run 1
./run 2 
./run 3
```

If your solution requires any setup steps, you should also include documentation that another developer would be able to follow in order to run it on their computer.

### Renew Format

The headers of the Renew Format CSV are as follows:

|property_external_id|property_name|property_description|street_address|listing_external_id|unit|size|beds|baths|price|

Note: "External ID" refers to the unique identifer used by the operator in their system.

A file called `output-1.sample.csv` is provided, which was built from a working solution using the following command:

```
run.sh 1 > output-1.sample.csv
```

### Renew Operator APIs

All required operator APIs are mocked using [Apiary](https://apiary.io/) and provided below. The responses for each of these APIs are static, but they should always be up and available.  Please let us know if you have any trouble accessing them.

* [Operator 1](https://private-5357ee-operator1.apiary-mock.com/listings)
* [Operator 2](https://private-b2fd6d-operator22.apiary-mock.com/listings)
* Operator 3
    * [Properties API](https://private-0bf0b9-operator31.apiary-mock.com/properties)
    * [Listings API](https://private-0bf0b9-operator31.apiary-mock.com/rental_listings)
