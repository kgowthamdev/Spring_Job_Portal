# Spring_Job_Portal

1. Company Endpoints
Start with companies because jobs depend on companies (via company_id).

1.1 Create a Company
Method: POST
Endpoint: /api/companies
Body:
json
Copy code
{
    "name": "Tech Corp",
    "location": "New York"
}
Expected Response: Company object with an id.



1.2 Get All Companies
Method: GET
Endpoint: /api/companies
Expected Response:
json
Copy code
[
    {
        "id": 1,
        "name": "Tech Corp",
        "location": "New York"
    }
]


1.3 Get Company by ID
Method: GET
Endpoint: /api/companies/{id}
Replace {id} with the id of the created company.



2. Job Endpoints
After creating a company, add jobs linked to that company.

2.1 Create a Job
Method: POST
Endpoint: /api/jobs
Body:
json
Copy code
{
    "title": "Software Engineer",
    "description": "Develop and maintain software",
    "salary": 75000,
    "company": {
        "id": 1
    }
}
Expected Response: Job object with an id.



2.2 Get All Jobs
Method: GET
Endpoint: /api/jobs
Expected Response: List of all created jobs.


2.3 Get Job by ID
Method: GET
Endpoint: /api/jobs/{id}
Replace {id} with the id of the created job.


2.4 Update a Job
Method: PUT
Endpoint: /api/jobs/{id}
Body:
json
Copy code
{
    "title": "Senior Software Engineer",
    "description": "Lead and develop software projects",
    "salary": 95000,
    "company": {
        "id": 1
    }
}
Expected Response: Updated job object.



2.5 Delete a Job
Method: DELETE
Endpoint: /api/jobs/{id}
Replace {id} with the id of the job to delete.



3. Application Endpoints
Once jobs are created, you can test job applications.

3.1 Apply for a Job
Method: POST
Endpoint: /api/applications
Body:
json
Copy code
{
    "candidateName": "John Doe",
    "email": "john.doe@example.com",
    "job": {
        "id": 1
    }
}
Expected Response: Application object with an id.



3.2 Get Applications for a Job
Method: GET
Endpoint: /api/applications/job/{jobId}
Replace {jobId} with the id of the job.
Expected Response: List of applications for the given job.



3.3 Get Applications by Candidate Email
Method: GET
Endpoint: /api/applications/candidate/{email}
Replace {email} with the candidate's email.
Expected Response: List of applications submitted by the candidate.


