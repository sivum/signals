Local setup

Prerequistites 
- Docker
- JDK17 

##To start up environment

run docker-compose  -f docker-compose.yml up -d.

This will spin up your mysql instance that you can use for testing 


create sql schema

Signals

Table

``` sql
create table Signals.Signals
(
    Id    bigint auto_increment
        primary key,
    level varchar(20) null,
    noise double      null
);
```



##To run some perf tests

cd to infrastructure\k6\

run application on whatever port you like, just make it neccesary updates in script.js in infrastructure\k6\

docker run --rm -i --network=host grafana/k6:0.50.0 run - < script.js


##Perf example 

Intel(R) Core(TM) i7-10850H CPU @ 2.70GHz   2.71 GHz
80.0 GB RAM



    data_received..................: 10 MB 169 kB/s
     data_sent......................: 17 MB 278 kB/s
     http_req_blocked...............: avg=236.06µs min=1.2µs    med=2.9µs    max=165.59ms p(90)=4.3µs    p(95)=4.89µs
     http_req_connecting............: avg=209.33µs min=0s       med=0s       max=143.09ms p(90)=0s       p(95)=0s
     http_req_duration..............: avg=212.82ms min=156.07ms med=179.47ms max=4.85s    p(90)=264.69ms p(95)=315.46ms
       { expected_response:true }...: avg=212.82ms min=156.07ms med=179.47ms max=4.85s    p(90)=264.69ms p(95)=315.46ms
     http_req_failed................: 0.00% ✓ 0          ✗ 56250
     http_req_receiving.............: avg=278.55µs min=14.7µs   med=107.1µs  max=15.34ms  p(90)=763.97µs p(95)=957.71µs
     http_req_sending...............: avg=31.67µs  min=7.8µs    med=20.6µs   max=10.44ms  p(90)=53.3µs   p(95)=61.1µs
     http_req_tls_handshaking.......: avg=0s       min=0s       med=0s       max=0s       p(90)=0s       p(95)=0s
     http_req_waiting...............: avg=212.51ms min=156.01ms med=179.17ms max=4.85s    p(90)=264.14ms p(95)=314.9ms
     http_reqs......................: 56250 935.009343/s
     iteration_duration.............: avg=213.38ms min=156.37ms med=179.75ms max=4.9s     p(90)=264.98ms p(95)=315.81ms
     iterations.....................: 56250 935.009343/s
     vus............................: 200   min=200      max=200
     vus_max........................: 200   min=200      max=200


try the equivalent on syncrous springboot without suspending coroutines and reactive driver just for fun and see the timeouts happen due to thread starvation

