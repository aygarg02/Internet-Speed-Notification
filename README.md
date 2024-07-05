# Internet Speed Tracker with Email Notifications

## Table of Contents
- [About](#About)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Configuration](#configuration)
- [Usage](#usage)
- [License](#license)
## About
-count the  number of times the speed goes below the certain threshold in the whole day and send the notification to the recipitent in our case internet service porvider at night 11 PM that in the whole day this much time the internet is not working properly
## Features
- Measures internet speed at regular intervals.
- Logs speed measurements.
- Sends email notifications if speed drops below a defined threshold.
  

## Technologies Used
- Java
- Spring Boot
- JavaMail API
- speedtest-cli (for measuring internet speed)

## Prerequisites
- Java 8 or higher
- Maven
- A valid email account for sending notifications
- speedtest-cli installed on your system

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/internet-speed-tracker.git
   cd internet-speed-tracker
