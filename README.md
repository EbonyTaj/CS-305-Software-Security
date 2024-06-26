# CS-305-Software-Security
### Summary of Client and Software Requirements

**Client Overview:**
Artemis Financial helps clients with savings, retirement, investments, and insurance. They wanted to modernize their operations and make their web applications more secure to protect client data.

**Software Requirements:**
They needed to add a file verification step with checksum verification to their web application and sought advice on the latest security measures for their RESTful web API.

### Addressing Software Security Vulnerabilities

**Identifying and Fixing Vulnerabilities:**
I focused on pinpointing weak spots in the code and implementing strong security measures. These included input validation, better error handling, cryptographic security for data integrity, and data transmission security with HTTPS.

**Importance of Secure Coding:**
Secure coding is crucial to prevent unauthorized access and data breaches. It helps maintain data integrity, confidentiality, and availability, keeping client trust and the company's reputation intact.

**Value of Software Security:**
Good software security protects critical information, ensures compliance with regulations, and prevents financial losses from breaches. It also boosts customer confidence and gives a competitive edge.

### Challenges and Helpful Aspects of the Vulnerability Assessment

**Challenges:**
The main challenge was ensuring security enhancements didn't affect the application's performance. Balancing security and functionality required careful planning.

**Helpful Aspects:**
Using the OWASP Dependency-Check plugin was very helpful in identifying vulnerabilities in third-party dependencies. Manual code reviews also ensured a thorough assessment of potential risks.

### Increasing Layers of Security

**Approach:**
I implemented cryptographic hash functions for checksum verification, configured HTTPS, added robust input validation, and enhanced error handling. These measures collectively strengthened the application's security.

**Future Assessments and Mitigation Techniques:**
In the future, I'd continue using tools like the OWASP Dependency-Check plugin, static code analysis tools, and regular security audits. Choosing mitigation techniques would involve assessing the risk and impact of identified vulnerabilities and applying best practices.

### Ensuring Functional and Secure Code

**Verification Process:**
I performed comprehensive testing, including unit, integration, and manual tests, to ensure the code was functional and secure. After refactoring, I ran the OWASP Dependency Check to ensure no new vulnerabilities were introduced.

**Checking for New Vulnerabilities:**
Static analysis tools and dependency checks identified any new vulnerabilities. Manual code reviews also played a crucial role in ensuring the integrity and security of the refactored code.

### Resources, Tools, and Coding Practices

**Helpful Resources and Tools:**
- **OWASP Dependency-Check Plugin:** For identifying vulnerabilities in dependencies.
- **Spring Boot Framework:** For building secure web applications.
- **Keytool:** For generating and managing SSL certificates.
- **Code Reviews and Static Analysis Tools:** To ensure code quality and security.

**Coding Practices:**
- **Input Validation:** To prevent injection attacks.
- **Error Handling:** To avoid exposing sensitive information.
- **Cryptographic Security:** For data integrity and secure communications.

### Showcasing Skills to Future Employers

**Demonstrable Work:**
Future employers might be interested in the following:
- **Security Enhancements:** Implementation of cryptographic hash functions and HTTPS configuration.
- **Vulnerability Assessments:** Use of OWASP Dependency-Check and static code analysis.
- **Refactoring and Testing:** Ensuring code quality through thorough testing and verification.
- **Documentation and Reporting:** Documenting findings and improvements effectively to highlight the value added to the client's project.

By showcasing these elements, I can demonstrate my proficiency in secure coding practices, vulnerability assessment, and enhancing and maintaining software security.
