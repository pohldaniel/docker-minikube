FROM nginx

ADD nginx.conf /etc/nginx/conf.d/nginx.conf
ADD certs/cert.cer /etc/nginx/external/certs/cert.cer
ADD certs/cert.key /etc/nginx/external/certs/cert.key
ADD auth/nginx.htpasswd /etc/nginx/external/auth/nginx.htpasswd