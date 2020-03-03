
# Tour Guide project

 #### 1.Prezentare generala

1.1 Introducere

Lucrarea are ca tema “Website pentru prezentarea obiectivelor turistice  ale unui oras.”

Prin aceasta aplicatie se doreste imbunatatirea eficientei operationale in cadrul planificarii unei calatori prin:
-Fluidizarea si imbunatatirea fuxului de obiective turistice dintr-un oras
-Gestionarea unui volum ridicat de date despre orase
-Eliminarea planurilor ineficiente din sistem
-Punerea la dispozitia utilizatorilor de informatii despre obiectivele apropiate
-Asigurarea unei securitati sporite a informatiei , fiecare utilizator avand cont propriu

In cadrul acestui proiect se cere implementarea unui website care inlocuieste ghidul turistic , utilizatorul avand la dispozitie tot ce este necesar pentru a vizita un oras , de la obiective turistice pana la locatia acestora.

Pentru acest proiect am ales sa implementez o agentie de turism in Java , si am folosit urmatoarele utilitati: Maven ,Thymeleaf , Hybernate si frameworkul Java Spring Boot. Am lucrat in
mediul Eclipse .

Cu ajutorul acestui site vom putea alege tara pe care dorim sa o vizitam , orasul iar mai apoi in functie de dorinte, fiecare persoana va putea cauta informatii suplimentare despre respectivul oras, restaurantele,obiectivele turistice, muzeele si hotelurile . Acestea vor mai putea lasa o recenzie dupa vizitaria acestora.

Fiecare utilizator dispune de propriul cont unde isi poate adauga calatoriile cu anumite informatii precum inceputul calatoriei, sfarsitul, poze ,precum si prietenii care i-au insotit si dispun de asemenea de un cont.

De asemenea aplicatia dispune de 3 tipuri de useri: Admin, Regular Memeber si Editor,fiecare avand posibilitati diferite in cadrul aplicatiei.

### 2.Diagrama UML
[![N|Solid](https://i.ibb.co/vvYc97C/uml.gif)]

### 3.Utilitati

Acest proiect doreste ca la finalul implementarii sa satisfaca
urmatoarele lucruri :
1)CRUD pe baza de date: adica CREAT , READ , UPDATE , DELETE
unor orase/utilizatori/tari;
2. Existenta unei baze de date
3. Login pe pagina , register pe pagina si restetarea parolei
### 4.Modul de operare.Prezentarea interactivitatii
Ideea de baza a proiectului meu este sa imi construiesc o baza de date unde voi pastra pentru fiecare utilizator informatiile fiecaruia si totodata detaliile privind orasele si tarile.
Un client se poate inregistra, loga , iar mai apoi poate sa aleaga orasul sau tara pe care doreste sa le viziteze impreuna cu informatiile despre acestea .Putem sa adaugam orase, sa sterge orase , sa le afisam pe toate din baza de date. Toate aceste functionalitati sunt disponibile si pentru tari . 
    Ca si implementare de design patterns , o sa folosesc Observer si
Factory Method . Factory Method o sa il folosesc pentru tipuri de Useri
(Admin,Editor,RegularUser) , noi avand optiuni diferite pentrun fiecare tip de user , iar Observer pentru a instiinta userul ca s-a modificat ceva in baza de date a oraselor.
    Folosirea DP-ului Observer necesita creearea unui obiect
cu rolul de subiect, care are ca parametru o lista de obiecte
dependente, cu rolul de observatori, pe care le apeleaza intotdeauna
cand se intampla vreo actiune.
Implementarea acestui proiect a inceput prin creearea unei baze de
date in MySql Workbench , am facut o noua schema TourGuide, si i-am
setat o parola .Am facut configurarile necesare in proiectul meu pentru
a se conecta la baza de date. Dupa aceea , mi-am creeat tabelele si
totodata le-am populat cu records. Pentru update/create/delete ne-am
folosit si de utilitarul PostMan unde am facut anumite teste , daca
operatiile noastre functioneaza in mod corect .
Am implementat end points pentru Admin, Editor, RegularUser,City,Country pentru a
afisa in local host sau in Postman toti utilizatorii,orasele sau tarile existente in baza
mea de date cu localhost:8080/admin/all , localhost:8080/city/all ,localhost:8080/country/all.
Aceste endpoints ne vor ajuta mai incolo pentru realizarea partii de
FrontEnd. In acest fel , ne-am dat seama destul de usor cum se folosesc
acestea.
Java DOC este folosit pentru metodele mai complicate . Am precizat care sunt @param si
@return la fiecare dintre metodele de add , delete , update , list all si
alte comentarii ajutatoare pentru a realiza un cod cat mai usor de
inteles . Pentru fiecare metoda , la care nu ii este evidenta folosinta (ce
returneaza si ce primeste) am adaugat JAVA DOC.
Pentru partea de front-end am folosit pagini html si javascript . JavaScript este gazduit în documentele HTML și executat în interiorul lor. Majoritatea obiectelor JavaScript au etichete HTML pe care le reprezinta, astfel incat programul este inclus pe partea de client a limbajului. JavaScript foloseste HTML pentru a intra în cadrul de lucru al aplicatiilor pentru web.
Am generat un tabel in HTML unde voi afisa toate orasele .

### 5.Modul de operare.Prezentarea interactivitatii
La deschidere ne apare pagina Home unde avem tabelul cu orasele existente in baza de date.
Avem la dispozitie 3 butoane cu ajutorul carora putem adauga, sterge sau afisa toate orasele.
Mai jos avem o lista cu posibile destinatii ( tari) . La fiecare tara avem optiunea de "See cities" cu ajutorul caruia am redirectionat pagina pentru a afisa toate orasele disponibile fiecarei tari. 
![N|Solid](https://i.ibb.co/tHh4Dkx/home.png)
In headerul fiecarei pagini sunt afisate celelalte pagini aflate la dispozitia utilizatorului .
Pe pagina About Us sunt cateva informatii despre calatorii si de asemenea 2 butoane cu ajutorul carora este redirectionata pagina spre crearea unui cont .
In cazul in care utilizatorul are deja cont , in header exista optiunea Login . Pe pagina Login acesta se poate Loga sau apasa "Don't have an account" .
![N|Solid](https://i.ibb.co/t36xjjj/loginn.png)

   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
