import http from 'k6/http';
import { uuidv4 } from 'https://jslib.k6.io/k6-utils/1.4.0/index.js';

//docker run --rm -i --network=host grafana/k6:0.50.0 run - < script.js

export const options = {
    vus: 50,
    duration: '60s',
};
export default function () {
    const params = {
        headers: {
            'Content-Type': 'application/json',
        },
    };

   
    const requestId = uuidv4()
    const level = "noize"
    const noise_ratio = Math.floor(Math.random() * 500)


    const signal_payload = JSON.stringify({
        requestId:requestId,
        level: level,
        noise_ratio:noise_ratio,
        correlationId: uuidv4()
    });
    
    http.post('http://host.docker.internal:8080/api/signals', signal_payload, params);
}
