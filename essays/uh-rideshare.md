---
layout: essay
type: essay
title: "UH Ride Share: Making Transportation Easier for Students"
date: 2026-11-04
published: true
labels:
  - Software Engineering
  - Nextjs
  - React
---

<img width="300px" class="rounded float-start pe-4" src="../img/carpooling.jpeg">

## The Problem

At UH Mānoa, not everyone has access to a car. At the same time, a lot of students still need to get to places like Walmart, Costco, Ala Moana, the airport, or even just across town. Public transportation can take a long time, and rideshare services like Uber can get expensive, especially for students on a budget.

From what I’ve seen, a lot of people rely on friends or group chats to find rides. The problem is that there’s no centralized, reliable way for students to connect with others who are already going the same direction. Most of the time, it comes down to luck or knowing the right people.

## The Solution

UH Ride Share is a web application designed specifically for UH Mānoa students to find and offer rides. The idea is simple: students can either post a ride they are offering or request a ride they need.

Drivers can create posts with details such as destination, departure time, and available seats. Passengers can browse available rides and request to join. Instead of randomly asking around, students can quickly find others with similar plans.

The goal is to make transportation more accessible, affordable, and convenient within the UH community.

## The Special Sauce

The main feature that makes this application more than just a basic listing system is personalization.

Each user will have an account and profile that stores their preferences, such as common destinations, availability, and past ride activity. Based on this information, the app can suggest relevant rides or potential matches automatically.

For example, if a user frequently travels to Ala Moana in the evenings, the app can prioritize showing rides that match those patterns. This creates a more tailored experience instead of forcing users to manually search every time.

## Mockup Page Ideas

The application will include several main pages:

- **Landing Page**: A simple introduction to the app with login and registration options.
- **Dashboard**: Displays available rides with filters for destination, time, and role (driver or passenger).
- **Create Ride Page**: A form where users can post a new ride with details like location, time, and number of seats.
- **Ride Detail Page**: Shows full information about a ride and allows users to request to join.
- **Profile Page**: Displays saved rides, ride history, and user preferences.

These pages will be built using Next.js for routing, React for component structure, and Bootstrap 5 for layout and styling.

## Use Case Ideas

There are several realistic scenarios where this app would be useful:

- A student wants to go to Costco and finds a ride posted by another student.
- A driver posts that they are heading to Ala Moana and fills up available seats.
- A user saves frequent destinations and quickly finds matching rides.
- Students connect with others who have similar schedules and travel patterns.

## Beyond the Basics

If time allows, additional features could improve the app further:

- A rating system for drivers and passengers
- A “trusted user” badge based on activity
- Ride history tracking
- A simple messaging system between users

These features would help build trust and make the platform more reliable.

## Final Thoughts

This project focuses on solving a real problem within the UH Mānoa community. Transportation is something that affects a lot of students, and even a simple tool like this could make a noticeable difference.

From a software engineering perspective, the project uses modern tools like Next.js, React, and Bootstrap 5, while also incorporating user accounts, database interaction, and personalized features. It’s a realistic and practical application that balances functionality with scope.

---

*I used ChatGPT to assist with brainstorming and refining this project idea. The final proposal and explanations reflect my own understanding and perspective.*
