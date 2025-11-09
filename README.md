# TravelAgence
Il s agit d'une application de gestion d'une agence de voyage inter urbain de la sauvergarde des entrees et compte jusqu'a la reservation en ligne.
Presentation du projet : Presentation du probleme, Presentation des fonctionnalites, Modelisation par diagramme,Presentation des interfaces

                                 SYSTEME DE GESTION D’UNE AGENCE DE VOYAGE INTERURBAIN

PROBLEMES :

-	Inscription manuscrite.
-	L’appréciation de la qualité du voyage au prêt de l’agence de transport.
-	Suivie des trajets a distance. 
-	Gestion des réservations (Réservation classique et Réservation VIP).
-	Gestion de l’état du bus en temps réel.
-	Gestion des voyages ratés.
-	Gestion annulation voyages.
-	Gestion des anciennes réservations déjà faite en manuscrit.

FONCTIONNALITES PRIMORDIALES

Super Admin
-	Création de l’administrateur et l’attribué des droits.
-	Suppression, modification de l’administrateur.

 Administrateur

-	CRUD sur les bus
-	Se connecter en entrant son nom et son mot de passe.
-	Se déconnecter.
-	Changer de mot de passe.
-	CRUD voyage
-	Gestion de ses managers (CRUD)
-	Gestion des réservations (CRUD)
-	Gestion des clients (CRUD)
-	Suivie des bus a distance via un système embarqué et de l’intelligence artificielle (Fonctionnalité à venir).
-	Visualiser les statistiques sur les réservations journalières.
-	Visualiser les réservations effectuer par un manager.
-	 Visualiser les réservations effectuer par un client.
-	Visualiser le chiffre d’affaires pour tous les voyages par jour, mois, par semaine.
-	Visualiser le nombre de voyages sur un camembert.

Manager

-	Demander à l’administrateur pour la modification des voyages
-	Gestion des réservations.
-	Gestions des clients (CRUD) soit par chargement fichier excel, Word ou PDF et par formulaire.
-	Générer un QRCODE après l’établissement d’une réservation pour actualiser sa présence.
-	Générer une facture après la réservation.


Clients

-	Réserver une place pour un voyage à partir de la CNI ou du recipicé valide ou pas de la personne concernée par le voyage.
-	Se connecter en précisant son nom et son mot de passe   
-	Se déconnecter à la plateforme. 
-	Changer de mot de passe.
-	Annuler sa réservation en cas d’imprévu.
-	Signaler en cas de voyage raté afin d’avoir la possibilité d’une reprogrammation. Cela ne peut se faire qu’une seule fois.
-	Consulter les voyages et les tarifs.
-	Faire un retour par rapport au voyage.
-	Paiement des réservations par maviance, PayPal, compte bancaire.

FONCTIONNALITES AVENIR
-	Concevoir un agent et une IA permettant aux personnes malvoyantes, sous, nués, sous-nués en utilisant le principe d’un mandataire dans l’aide dans le déroulement du processus de réservation.
-	Suivi du trajet du bus de voyage par le chef d’agence. Pour cela nous allons implémenter un système embarques.
-	Associer les chauffeurs a bus de voyages pour les voyages.
-	Suivie de la maintenance par rapport aux bus de voyages (Gestion des maintenances c’est-à-dire planification des maintenances, mise à jour des maintenances, suspension d’une maintenance). 
-	Transmettre toutes les CNI aux diffèrent lieu de contrôle afin de limiter le problème que le passager n’a pas de CNI lors du voyage. Du cours si un passager n’a pas de CNI le service de contrôle pourra tout simplement consulter sa CNI sur la plateforme

Elaboration du diagramme de classe

Définition des attributs 
-	Bus                  

id
CreationDate 
LastUpdate
IsDeleted
Immatriculation
CarteGrise
categorie
nbrePlace
statut
idDomain

-	Voyage           

id
LieuDepart
LieuArrivee
Tarif
IdBus
CreationDate
LastUpDate
IsDeleted

-	Réservation

id
IdClient
IdVoyage
CreationDate
VoyageManque
LastUpdate
IsDeleted


-	Account

id
firstName
lastName
email
code
phoneNumber
CNI
isAdmin
creationDate
lastUpdate
isDeleted
picture
bothDate

-	Domain        

id
name
phoneNumber
adress
ville
creationDate
lastUpdate
isDeleted


-	DomainManager

Id
idDomain
idAccount
creationDate
lastUpdate
idDeleted

-	Retour

Id
idVoyage
idReservation
idAccount
Objet : suggestion, annulation du voyage, demande de remboursement, plainte
Message
creationDate
lastUpDate
isDeleted


Outils nécessaires pour l’élaboration du projet cote front-end et back-end

Frontend 
Technologies : conception en microservices en utilisant React JS et Angular.
Back-end 
Technologies : conception en microservices en utilisant Spring boot, DotNet et python pour la partie 
IA : On intègre l’IA pour l’analyse des données et prise de décision 
Base de données :  MYSQL pour la première version, pour la deuxième version nous utiliserons MongoDB. 
<img width="944" height="510" alt="Avenir" src="https://github.com/user-attachments/assets/829b6265-2a04-4ca7-ba14-53114b5324fe" />








