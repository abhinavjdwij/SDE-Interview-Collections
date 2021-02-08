### CQRS (Command and Query Responsibility Segregation)

**Summary:**

It is simply the process of separating services that read data and the services that write data to datastores. In partial implementation, only code level separation is done and database remains the same. In full implementation, even DBs are separated.

#### Pros:

1. Increases security of system, a read API will never have any side effect.
2. Databases can be optimised, write systems need not face issues of read heavy systems and read systems can be optimised for reads. This in turn can help scalability.
3. Can be easier to maintain teams in a working group.

#### Cons:

1. Sometimes write operations need multiple read operations, this would require making calls to read APIs from write services.
2. Full CQRS implementation (i.e using separate DB) brings the challenge of keeping read and write datastores in sync. While this can be handled with eventual consistency using event sourcing, this might increase the complexity of system by a lot.

**References:**

https://dzone.com/articles/microservices-with-cqrs-and-event-sourcing

https://danielckv.medium.com/introduction-to-cqrs-in-microservices-70e4759d9ecc