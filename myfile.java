Rest Client ::
STEP 1::
A.url: http://localhost:8989/auth/oauth/token?username=guest&password=guest123&grant_type=password
method:post
C.Authentication: Basic Authentication 
  user: service-account-1
  password:service-account-1-secret 

D. Run and get the token.

STEP 2::
A.URL:: http://localhost:8989/auth/getData
B. Headers:
    Name: Authorization
    Value:bearer [TOKEN]
C. Run and get the data.

http://localhost:8989/auth/oauth/token_key?username=guest&password=guest123&grant_type=password