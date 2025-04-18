FROM node
WORKDIR /app
COPY package.json .
RUN npm install
COPY . .
EXPOSE 5173
CMD ["npm","start"]
//Please kindly remove
docker build -t spaapp:1.0 .
docker run -d --name spaappcontainer -p 3200:5173 spaapp:1.0
