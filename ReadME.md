Perf testing

Syncronous with 50 VU's for 60s

   data_received..................: 35 MB  392 kB/s                                                                   
   data_sent......................: 57 MB  642 kB/s                                                                   
   http_req_blocked...............: avg=872.9µs  min=0s        med=2.2µs  max=15.6s    p(90)=3.2µs  p(95)=4µs         
   http_req_connecting............: avg=867.22µs min=0s        med=0s     max=15.6s    p(90)=0s     p(95)=0s          
   http_req_duration..............: avg=5.32ms   min=0s        med=4.39ms max=480.11ms p(90)=9.2ms  p(95)=12.1ms      
     { expected_response:true }...: avg=5.33ms   min=34µs      med=4.39ms max=480.11ms p(90)=9.2ms  p(95)=12.11ms     
   http_req_failed................: 0.05%  ✓ 100         ✗ 192900                                                     
   http_req_receiving.............: avg=470.6µs  min=-674984ns med=33.2µs max=33.77ms  p(90)=1.61ms p(95)=2.45ms      
   http_req_sending...............: avg=28.51µs  min=0s        med=12.5µs max=10.32ms  p(90)=40.5µs p(95)=60.5µs      
   http_req_tls_handshaking.......: avg=0s       min=0s        med=0s     max=0s       p(90)=0s     p(95)=0s          
   http_req_waiting...............: avg=4.82ms   min=0s        med=3.95ms max=466.82ms p(90)=8.34ms p(95)=10.98ms     
   http_reqs......................: 193000 2164.577232/s                                                              
   iteration_duration.............: avg=22.1ms   min=822.57µs  med=4.78ms max=30s      p(90)=9.8ms  p(95)=12.83ms     
   iterations.....................: 193000 2164.577232/s                                                              
   vus............................: 1      min=1         max=50                                                       
   vus_max........................: 50     min=50        max=50      






   With Suspend function

     data_received..................: 47 MB  517 kB/s
     data_sent......................: 76 MB  847 kB/s
     http_req_blocked...............: avg=50.07µs  min=0s         med=2.2µs  max=25.92ms  p(90)=3.2µs   p(95)=3.9µs
     http_req_connecting............: avg=45.69µs  min=0s         med=0s     max=25.87ms  p(90)=0s      p(95)=0s
     http_req_duration..............: avg=5.31ms   min=0s         med=4.26ms max=783.98ms p(90)=10.25ms p(95)=13.49ms
       { expected_response:true }...: avg=5.31ms   min=44µs       med=4.26ms max=783.98ms p(90)=10.25ms p(95)=13.49ms
     http_req_failed................: 0.03%  ✓ 88          ✗ 256765
     http_req_receiving.............: avg=469.54µs min=-854967ns  med=34.9µs max=214.61ms p(90)=1.65ms  p(95)=2.66ms
     http_req_sending...............: avg=26.4µs   min=-2134478ns med=12.8µs max=25.62ms  p(90)=41.1µs  p(95)=51µs
     http_req_tls_handshaking.......: avg=0s       min=0s         med=0s     max=0s       p(90)=0s      p(95)=0s
     http_req_waiting...............: avg=4.82ms   min=0s         med=3.87ms max=744.09ms p(90)=9.33ms  p(95)=12.11ms
     http_reqs......................: 256853 2854.432173/s
     iteration_duration.............: avg=15.97ms  min=897.19µs   med=4.63ms max=30s      p(90)=10.84ms p(95)=14.14ms
     iterations.....................: 256853 2854.432173/s
     vus............................: 11     min=11        max=50
     vus_max........................: 50     min=50        max=50
                                                 
                                                                                                                      
                                                                                                                      


