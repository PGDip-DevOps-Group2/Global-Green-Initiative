# Global-Green-Initiative

# Table of Contents
- [Preamble](#preamble)
- [Product Owner](#product-owner)
- [Rockstars](#rockstars)
- [Project Deadline](#project-deadline)
- [Project Specification](#project-specification)
- [Useful Links](#useful-links)
- [More Information](#more-information)
- [Risk Register](#risk-register)
- [Tenants of Design](#tenants-of-design)
- [Social Contract](#social-contract)
- [Meetings](#Meetings)
- [Communication](#communication)
- [Other]
- [Branching Strategy]
- [Estimating Story Points](#estimating-story-points)
- [Definition of Ready](#definition-of-ready)
- [Definition of Done]
- This is the online repository for the DevOps Assignment.


Our product will be delivered using an Agile methodology that embraces the DevOps culture. Please note that our culture embraces change and these documents are treated as living, breathing artefacts that will be continuously updated.

## Preamble

# Scrum Master
<<list week number, student name>>
20/1/24 - Ciaran
27/1/24 - Abi
03/2/24 - Arkadiusz
10/2/24 - Michael
17/2/24 - Andrzej
24/2/24 - Ciaran
02/3/24 - Abi
09/3/24 - Arkadiusz
16/3/24 - Michael
23/3/24 - Andrzej

# Product Owner
Ciaran Doheny (Permanent)

# Rockstars
1. Abi Bolujo
2. Andrzej Koeller
3. Arkadiusz Skopinski
4. Ciaran Doheny
5. Michael Dowling



# Project Deadline
Refer to BB for deadlines

# Project Specification
Clean and simple design
User access levels (client, administrator)
Includes at least one self-developed API and one web service
To be run over <specify platform>

# Frameworks
We will be using MongoDB for our database
Database persistence technology
Define the business requirements
Named queries and database triggers for security
Regex for cleansing and validation of data before sending it to the database.

# Useful Links
 - Project Slack: https://atudevops.slack.com
 - GitHub: https://github.com/PGDip-DevOps-Group2/Global-Green-Initiative
 - Jira Project: https://cidoatu.atlassian.net/jira/software/c/projects/NE/boards/4
 - Confluence space: https://cidoatu.atlassian.net/wiki/spaces/NE/

# More Information
For more information, visit our confluence space

# Section	Description
Process     https://cidoatu.atlassian.net/wiki/spaces/NE/pages/851981/Team+Processes
Project Log	    Log of project activities
Costings	Overview of the project cost
Architecture	https://cidoatu.atlassian.net/wiki/spaces/NE/pages/1998857/Architecture
Environments	Overview of the environment set-up
DR Plan	Disaster Recovery Plan and procedures
Requirements	https://cidoatu.atlassian.net/jira/software/c/projects/NE/boards/4
SLAs	Service level agreements
Risk Management	https://cidoatu.atlassian.net/wiki/spaces/NE/pages/15925282/Risk+Register
Security	https://cidoatu.atlassian.net/wiki/spaces/NE/pages/1933329/Security


# Risk Register
Located in Confluence - https://cidoatu.atlassian.net/wiki/spaces/NE/pages/15925282/Risk+Register


# Tenants of Design
The code framework to be used will be <<>>, we will be programming using the IDE visual studio code

# Security:
- << >>: uses static analysis to find bugs in code. 
 
- <<>>.

# Run Locally
 - Download or clone the repo to your desktop. 
 - Open with your IDE, (IntelliJ) 
 - From IntelliJ in the navbar select “Run” -> “Run ‘GlobalGreenInitiativeApplication’“ this will launch the application. 

  *Now that the application is running you can hit the endpoints from your browser. 

# List of endpoints: 
  - Homepage: http://localhost:8080/homepage/new 
  - Grants: http://localhost:8080/grants/new 
  - Customer: http://localhost:8080/customers/new 
  - H2-Console(database): http://localhost:8080/h2-console 

# Testing:
 #  Unit Testing (Mockito\Junit)
 - # Test Run
    - Run every time the codebase builds
 #  UI e2e Testing (Selenide\Junit)
 - # Test Run
    - mvn clean test (on the command line)
    - Uncomment to run in CI pipeline   //Configuration.headless = true;
# Static code check
   - Sonarcloud run
     
# Environments:
    staging and production
    tight configuration management for consistency and reproducibility
    automated creation and deployments
    integrated and automated pipeline (commit -> test -> deploy)

# Github version control:
    branches used
    version/release management

# Agile project management methods/principles (jira)
    https://cidoatu.atlassian.net/wiki/spaces/NE/pages/4522020/Agile+Process

# Social Contract
    Mobile phones be left on silent during sprint sessions and class time.
    Be on time for team meetings and class, if you are running late let the group know by sending a message into the Slack channel.
    Everyone has an equal voice and valuable contribution.
    When you are assigned a job, take ownership of it and keep it up to date, do not be afraid to ask others for help, always be honest about your work.
    Do not speak over someone when they are expressing a point; everyone has an equal voice.
    No blame culture.
    Do not be afraid to ask for help; we are all learning.
    No invisible work.
    Ask questions to make sure you understand the task given to you.
    Try to have some fun; teamwork makes the dream work.
    Use Agile methodologies in the project at all times.

# Meetings
Stand-ups will occur every Friday on teams and Monday using an Automated bot. Two per week.
Updates will be in the form: What I've done, Impediments, What I plan to do.
Sprint planning will occur after standup on Friday every week.
Please add and update items within Jira prior to the sprint planning session.
Sprint retro will be held every 3 weeks (timebox retro for 30 minutes, to be organised by the scrum master).
Points raised in the sprint retro will be noted and posted on the Slack channel by the Scrum Master. The Scrum Master is rotated per team member every week.
Backlog refinement will happen on after each Friday standup.
Task estimation will be done using t shirt sizing. 
Come prepared for meetings.
Be on time for stand-ups and meetings.
Mobile phones are on silent.
Everyone has an equal voice and valuable contribution.
Keep your language and tone professional at all times.
Be honest.

# Communication
Slack is the preferred method of communication.
Communication in this order: Slack, Microsoft Teams, E-Mail
If a demonstration is required, use Zoom, record the session and upload it to the Slack channel.
Raise a problem as soon as you see it.
Respect each other and understand differences in knowledge.
All team documents are to be created on Confluence.
There are no silly questions; if you don’t understand, ask.
Share success stories.
Focus on the positives.
Don’t make assumptions.
Don’t interrupt and cut another person off while they are talking.
Listen when someone is talking; don’t interject.
Zero tolerance for bullying.

# Agile way of working.
If you are assigned a job, take ownership of it and keep it up to date.
Stick to your agreed working patterns. Let the team know when you are late or going early.
Keep the JIRA board updated at all times.
Update the Kanban Board as you progress the story i.e. don’t update at standup.
Don't be afraid to ask for help.
Don't be afraid to give constructive criticism, as long as it is constructive.
Solve roadblocks within the team. If the impediment can’t be solved within the team, then give it to the Scrum Master.
Other
The Scrum Master role rotates each week, and the schedule is available in the process section.
Each member of the team will work approximately 3 hours per week unless they are on vacation.
Our branching strategy will ?????

# Estimating Story Points


# Definition of Ready & Done
https://cidoatu.atlassian.net/wiki/spaces/NE/pages/15859742/Definition+of+Ready+Done
