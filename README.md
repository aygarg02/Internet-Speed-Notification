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
- Count the number of times the internet speed drops below a certain threshold throughout the day and send a notification to the internet service provider at 11 PM stating how many times the internet was not working properly during the day
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
