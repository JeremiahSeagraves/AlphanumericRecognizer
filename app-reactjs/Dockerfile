FROM node:12.8-alpine

# Install bash
RUN apk add --no-cache bash


# set working directory
RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

# add `/usr/src/app/node_modules/.bin` to $PATH
ENV PATH /usr/src/app/node_modules/.bin:$PATH

# install and cache app dependencies
COPY ./ /usr/src/app

EXPOSE 3000:3000

RUN npm install

# start app
CMD ["npm", "start"]