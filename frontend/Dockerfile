FROM node:21-alpine
RUN apk add --no-cache tzdata
WORKDIR /app
COPY package.json .
COPY package-lock.json .
RUN npm install
COPY . .
EXPOSE 3000
ENTRYPOINT ["npm", "start"]
