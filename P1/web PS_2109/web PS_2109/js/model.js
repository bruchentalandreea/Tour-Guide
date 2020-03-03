const BASE_URL = "http://localhost:8080";

export default class Model {
    constructor(username, password) {
        this.authorization = "Basic " + btoa(username + ":" + password);
    }

    loadAllCity() {
        return fetch(BASE_URL + "/city/all", {
            method: "GET",
            headers: {
                "Authorization": this.authorization
            }
        }).then(response => response.json());
    }

    createCity(author,title,text,creationDate,tag) {
        return fetch(BASE_URL + "/city/add", {
            method: "POST",
            body: JSON.stringify({
                id:id
                nume:nume,
                descriere:descriere,
                imageURL:imageURL
            }),
            headers: {
                "Authorization": this.authorization,
                "Content-Type": "application/json"
            }
        }).then(response => response.json());
    }
}