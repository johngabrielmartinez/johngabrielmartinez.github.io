---
layout: essay
type: essay
title: "Learning What Software Engineering Actually Means"
date: 2026-05-06
published: true
labels:
  - Software Engineering
  - Agile Project Management
  - Configuration Management
  - Development Environments
  - ICS 314
---

<img width="300px" class="rounded float-start pe-4" src="../img/software-engineering.webp">

## Introduction

Before taking ICS 314, I mostly viewed software development as simply writing code that worked. My previous programming experience focused heavily on assignments completed individually, where the goal was usually to produce the correct output as efficiently as possible. While technical programming ability is still important, this course taught me that software engineering involves much more than just coding. Software engineering includes collaboration, organization, debugging strategies, project management, development workflows, testing, and maintaining stable systems over time.

Although the technology stack used in ICS 314 focused heavily on web application development through React, Next.js, Prisma, and TypeScript, the broader lessons extended far beyond building websites. Throughout the semester, I gained experience with concepts such as Agile Project Management, Configuration Management, and Development Environments. These concepts are relevant not only for web applications, but for almost any large-scale software project involving teamwork, iteration, and long-term maintenance.

By working on the UH GameLink project and completing the course WODs, I learned that software engineering is fundamentally about managing complexity in a structured and reliable way. The technical tools may change depending on the type of software being developed, but the underlying engineering principles remain important across many different project environments.

## Agile Project Management

One of the most important software engineering concepts I learned during ICS 314 was Agile Project Management. Agile development is a project management philosophy that focuses on iterative development, adaptability, collaboration, and continuous improvement. Instead of attempting to build an entire project at once, Agile encourages developers to divide work into smaller tasks and improve the software gradually over time.

In this course, we used a style of Agile development called Issue Driven Project Management. Rather than loosely discussing features or bugs, development tasks were organized into GitHub issues that clearly described problems, improvements, or new functionality. Team members could then work on those tasks individually, test their changes, and merge updates incrementally into the project.

At first, the issue-driven workflow felt overly formal for what seemed like a relatively small class project. However, as UH GameLink became more complex over time, I started to understand why structured project management matters. Even small changes could unintentionally break other parts of the application. Features such as reviews, editing functionality, responsive layouts, authentication behavior, and Playwright testing all depended on different parts of the project interacting correctly together.

Using GitHub issues helped organize development into manageable tasks rather than trying to fix everything at once. It also made debugging more manageable because changes could be isolated more easily. Throughout the semester, I learned the importance of incremental progress, testing changes carefully, and avoiding unnecessary large rewrites that could destabilize the application.

I could absolutely see myself applying Agile Project Management outside of web application development. Any large software project involving multiple developers, evolving requirements, or long-term maintenance could benefit from iterative development and issue tracking. Even outside software engineering, Agile concepts such as breaking large goals into smaller tasks, adapting to feedback, and improving incrementally are valuable organizational skills.

## Configuration Management

Another important concept I learned was Configuration Management. Configuration Management refers to the process of systematically organizing, tracking, and controlling changes within a software project. In practice, this often involves version control systems such as Git and GitHub, where developers can manage updates safely without losing stable versions of the software.

Before this class, I mainly used Git as a simple backup tool. During ICS 314, I learned that Configuration Management is much more important than simply saving code online. As projects become larger and more interconnected, managing changes carefully becomes critical to preventing bugs, conflicts, and broken functionality.

This became especially obvious during the UH GameLink project. Throughout development, there were multiple situations where seemingly small changes unexpectedly affected unrelated features. For example, adjusting one component could accidentally break pagination, modal functionality, Playwright tests, or responsive layouts. Because of that, making incremental commits and testing changes carefully became extremely important.

I also learned why developers emphasize committing working code frequently instead of waiting until massive changes are completed. The professor repeatedly warned us about breaking the site near deadlines, and I eventually understood why. Large untested changes make debugging much more difficult because it becomes harder to identify what specifically caused the issue.

Playwright testing reinforced this lesson even further. Sometimes the application appeared to work visually in the browser, but automated tests revealed hidden issues such as failed rendering, incorrect routing behavior, or missing elements. This showed me that software stability involves more than simply “looking correct” during casual testing.

Configuration Management is clearly applicable far beyond web applications. Any software project involving collaboration, deployment, or long-term maintenance needs reliable methods for tracking changes and protecting stable versions of the software. Even industries outside programming rely on similar principles of controlled updates, version tracking, and rollback strategies to maintain reliability.

## Development Environments

The third major concept I learned about was the importance of Development Environments. A development environment consists of the tools, frameworks, libraries, configurations, and systems used to create and test software. Before this course, I underestimated how much the environment itself affects software development.

Throughout ICS 314, we worked with a modern development stack that included Next.js, React, TypeScript, Prisma, ESLint, Playwright, Node.js, GitHub, and Vercel deployment tools. While each individual tool served a specific purpose, the larger challenge often involved getting all of these technologies to work together correctly.

One thing I learned quickly is that software behaving correctly in one environment does not guarantee it will behave correctly everywhere else. There were situations where code worked locally but failed during deployment or automated testing. Environment configuration, dependency versions, authentication behavior, and framework-specific settings could all affect whether the application functioned properly.

ESLint was another example of how development environments influence software engineering. At times, code that visually worked still failed because it violated formatting or quality standards enforced by the environment. Initially this felt frustrating, but over time I realized these tools help maintain consistency and readability across larger projects.

The development environment also influenced how debugging worked. Problems were not always caused by the code itself. Sometimes issues originated from dependency conflicts, incorrect imports, caching behavior, environment variables, or framework configuration. Learning to diagnose problems systematically across the entire environment became an important software engineering skill throughout the semester.

I can easily see the importance of development environments extending beyond web applications. Whether developing mobile apps, games, operating systems, or enterprise software, engineers rely on stable and consistent environments to build, test, and deploy reliable software. Understanding how tools interact together is a major part of professional software development.

## Conclusion

ICS 314 changed my understanding of what software engineering actually involves. At the beginning of the semester, I mostly associated programming with writing code that produced the correct result. By the end of the course, I realized that software engineering is equally about organization, collaboration, testing, debugging, environment management, and maintaining stability as projects grow more complex.

Through Agile Project Management, I learned the importance of iterative development and structured workflows. Through Configuration Management, I learned why carefully managing changes and maintaining stable versions of software is essential for long-term reliability. Through Development Environments, I learned that successful software engineering depends not only on writing code, but also on understanding the systems and tools supporting the development process.

Although this course focused on web application development, the underlying engineering concepts clearly apply far beyond websites. The lessons I learned about collaboration, debugging, version control, testing, and project organization are valuable for many different types of software projects and technical careers.

Overall, ICS 314 helped me understand that software engineering is not simply about coding quickly or making programs function. It is about building reliable systems in a structured, maintainable, and collaborative way.

*This essay was written by me with moderate AI assistance used primarily for brainstorming, organization, wording refinement, and reflection development.*
