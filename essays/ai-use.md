---
layout: essay
type: essay
title: "Learning Software Engineering Alongside AI"
date: 2026-05-05
published: true
labels:
  - Artificial Intelligence
  - Software Engineering
  - ICS 314
  - ChatGPT
  - Debugging
  - TypeScript
  - Next.js
---

<img width="300px" class="rounded float-start pe-4" src="../img/ai-coding.jpg">

## I. Introduction

Artificial intelligence has become increasingly common in education, especially in computer science and software engineering courses. Tools such as ChatGPT, GitHub Copilot, and other AI assistants are now capable of generating code, explaining concepts, debugging errors, and helping developers work more efficiently. In a course like ICS 314, which focuses heavily on modern software engineering practices, frameworks, debugging, and project development, AI naturally became part of my workflow throughout the semester.

Before taking ICS 314, I mainly viewed AI as a tool for answering simple questions or generating quick examples. During this course, however, I used AI much more actively while working on WODs, debugging TypeScript and Next.js issues, fixing ESLint errors, understanding framework behavior, and developing our final project, UH GameLink. The AI tools I used most often were ChatGPT and occasionally GitHub Copilot.

My experience with AI in ICS 314 was both helpful and frustrating at times. AI often accelerated debugging and helped me understand unfamiliar concepts more quickly, especially when dealing with React hooks, Prisma, Next.js routing, and Playwright testing. At the same time, AI was not always reliable. Some suggestions introduced new bugs, overcomplicated existing code, or ignored the structure of the project entirely. Because of that, I learned that AI works best as an assistant rather than a replacement for understanding the code myself.

Overall, AI became a significant part of how I approached software engineering during ICS 314. It improved my ability to troubleshoot problems and learn independently, but it also taught me the importance of verification, critical thinking, and understanding the reasoning behind generated solutions.

## II. Personal Experience with AI

### Experience WODs

I used AI frequently during the Experience WODs, especially when learning new frameworks or syntax for the first time. Many of the WODs involved concepts that were unfamiliar to me at the beginning, such as React components, TypeScript typing, routing, and framework-specific conventions. In several cases, AI helped me understand how to begin a problem when I felt stuck.

For example, during React and TypeScript-related WODs, I asked ChatGPT questions such as:

> “How do I pass props correctly in TypeScript React components?”
>
> “Why is this ESLint error happening in my React file?”
>
> “Show an example of using useState and props together.”

AI was useful because it gave quick explanations and working examples that helped me understand the structure of the code faster than reading documentation alone. However, the generated code was not always compatible with the exact requirements of the WOD. Sometimes the solutions were overly complicated or used patterns that had not yet been taught in class. Because of that, I often had to simplify or rewrite portions of the generated code myself.

### In-class Practice WODs

For the in-class practice WODs, AI mainly acted as a support tool rather than a direct answer generator. These exercises were more time-sensitive, so I often used ChatGPT for quick clarification rather than asking it to solve the entire problem.

Some example prompts I used were:

> “What does this TypeScript error mean?”
>
> “How do I map over an array in React?”
>
> “What is the difference between props and state?”

These shorter explanations were helpful because they allowed me to continue working without spending too much time searching through documentation. AI was especially useful when I needed reminders about syntax or framework behavior under time pressure.

### In-class WODs

I used AI less during the actual in-class WODs because of the strict time limits and the need to work quickly. In those situations, constantly switching between coding and asking AI questions could become distracting. Instead, I mainly relied on knowledge gained from previous practice and experience WODs.

When I did use AI during in-class WODs, it was usually for very focused questions such as:

> “Why is this JSX syntax invalid?”
>
> “How do I fix this ESLint warning quickly?”
>
> “What is the correct TypeScript type for this prop?”

AI was helpful for catching small mistakes or reminding me of syntax, but it was not always reliable under pressure. Some generated solutions introduced unnecessary complexity, which could make debugging even harder during a timed exercise.

### Essays

I also used AI while writing essays and portfolio reflections throughout ICS 314. Most of the time, I did not use AI to generate entire essays from scratch. Instead, I used it to help organize ideas, improve clarity, or rephrase awkward sentences.

For example, I asked prompts such as:

> “Make this reflection sound more natural and less robotic.”
>
> “Help me organize these ideas into a smoother essay structure.”
>
> “Rewrite this paragraph to sound more reflective.”

AI was helpful for improving readability and structure, especially when I already had the main ideas written down. However, I noticed that fully AI-generated writing often sounded generic or overly formal. Because of that, I usually rewrote large portions myself so the essays sounded more personal and reflected my actual experiences in the course.

### Final Project

AI was most useful during the UH GameLink final project. The project involved Next.js, Prisma, React, TypeScript, Playwright testing, ESLint, routing, authentication, and responsive design. Because the project became increasingly complex over time, AI helped me debug problems faster and better understand framework-specific behavior.

Some examples of prompts I used included:

> “Why is this Prisma query failing?”
>
> “Fix the React hook order issue in this component.”
>
> “Why does Playwright say the element is not found even though it exists?”
>
> “Help me fix ESLint errors in this Next.js file.”

AI was extremely useful for narrowing down possible causes of bugs and explaining framework behavior. However, I also experienced situations where AI-generated fixes accidentally broke existing features. One example involved the Find Players page, where broad rewrites removed working pagination and modal functionality even though the original problem was relatively small. That experience taught me that AI-generated code still needs careful review and testing before being trusted.

### Learning a Concept / Tutorial

AI helped me learn unfamiliar software engineering concepts throughout the semester. Sometimes documentation alone felt overwhelming, especially when learning frameworks like Next.js or understanding React hooks. In those situations, AI explanations were often easier to understand because they were conversational and could adapt to follow-up questions.

Some example prompts were:

> “Explain React hooks in simple terms.”
>
> “What does useEffect actually do?”
>
> “Explain Prisma relations with examples.”

Being able to ask follow-up questions made AI especially useful compared to static tutorials. At the same time, I still needed documentation because AI explanations sometimes simplified concepts too much or omitted important details.

### Answering a Question in Class or in Discord

There were times when I used AI before asking questions in Discord or during class discussions. Instead of immediately asking for help, I sometimes asked ChatGPT first to see if I could solve the issue independently.

For example:

> “Why is my Vercel deployment failing?”
>
> “Why is this prop undefined in React?”
>
> “Why does this page render locally but fail in production?”

Sometimes AI solved the issue completely. Other times, it at least helped me narrow down the problem before asking classmates or instructors for clarification.

### Asking or Answering a Smart-question

AI also helped me improve the quality of questions I asked. Instead of posting vague questions such as “my code does not work,” AI helped me identify what information was important to include.

For example, I used prompts like:

> “How can I describe this bug more clearly?”
>
> “What information should I include when asking about a Prisma error?”

This indirectly improved my communication skills because I became more aware of how to explain problems clearly and provide useful debugging context.

### Coding Example

One of the most common ways I used AI was for coding examples. Instead of asking for full solutions, I often asked for small examples demonstrating syntax or framework usage.

Some examples included:

> “Give an example of mapping over an array in React.”
>
> “Show an example of TypeScript props.”
>
> “Give an example of Prisma findMany with filtering.”

These examples were useful because they provided quick references without requiring me to search through multiple documentation pages.

### Explaining Code

I frequently used AI to explain existing code that I did not fully understand. This was especially useful for framework code, React hooks, or TypeScript syntax that looked confusing at first glance.

Some example prompts included:

> “Explain what this useEffect block is doing.”
>
> “Why does this async function use await here?”
>
> “Explain this Prisma query line by line.”

This helped me better understand how the code worked instead of simply copying it blindly.

### Writing Code

AI was also used directly for writing code, although I usually treated the generated output as a starting point rather than a final solution. Sometimes AI-generated code worked immediately, but other times it required major adjustments to fit the project structure or class expectations.

For example, I asked:

> “Generate a modal component for React Bootstrap.”
>
> “Help me create a Next.js API route.”
>
> “Write a TypeScript interface for this object.”

AI accelerated development significantly, especially during repetitive tasks or when creating initial scaffolding for components.

### Documenting Code

I occasionally used AI to help write comments, descriptions, or documentation for code. This was especially helpful when I wanted concise explanations for functions or project features.

Some example prompts were:

> “Write a short description for this function.”
>
> “Document this React component.”
>
> “Explain this API route briefly.”

Although AI helped improve clarity, I still reviewed the generated comments because some explanations were either too vague or too formal for the project style.

### Quality Assurance

AI was extremely useful for debugging and quality assurance tasks. I frequently pasted error messages or code snippets into ChatGPT to identify issues more quickly.

Examples included:

> “Fix the ESLint errors in this file.”
>
> “Why is this React hook causing errors?”
>
> “What is wrong with this Prisma schema?”
>
> “Why is Playwright failing this test?”

This was probably one of the most valuable uses of AI during the semester. Instead of spending hours searching for isolated errors, AI often helped identify likely causes immediately. However, I still had to verify the fixes carefully because generated solutions sometimes created new issues elsewhere in the project.

### Other Uses in ICS 314 Not Listed

Another way I used AI in ICS 314 was for workflow planning and troubleshooting strategy. Sometimes I was not asking for direct code fixes but instead for guidance on how to approach a problem logically.

For example:

> “What should I debug first in this situation?”
>
> “How should I structure this page?”
>
> “What is the safest way to refactor this component without breaking everything?”

This type of guidance was surprisingly useful because software engineering is not only about writing code. It also involves planning, organization, debugging strategy, and decision-making. AI often acted as a second perspective during difficult or frustrating parts of the project.

## III. Impact on Learning and Understanding

AI had a significant impact on how I learned software engineering concepts during ICS 314. In many situations, it accelerated my understanding by giving immediate explanations, examples, and debugging suggestions that would have taken much longer to find manually. Instead of spending large amounts of time searching through documentation or forum posts, I could ask direct questions and receive targeted explanations almost instantly.

One of the biggest advantages of AI was how interactive it felt compared to traditional learning resources. Documentation is important, but it is often written in a very technical or generalized way. AI allowed me to ask follow-up questions and request explanations in simpler terms. For example, when learning React hooks, Prisma queries, or TypeScript typing, I could continuously ask for clarification until the concept made more sense to me.

AI also helped reduce frustration during debugging. In software engineering, it is easy to spend hours stuck on a small issue without understanding the root cause. During the UH GameLink project, AI often helped narrow down likely causes for problems involving Next.js routing, Playwright testing, authentication behavior, or ESLint violations. Even when the solution itself was not completely correct, the suggestions often pointed me in the right direction.

At the same time, AI sometimes negatively affected learning when I relied on it too quickly. There were moments where I accepted generated code before fully understanding it, which made later debugging more difficult. I also noticed that AI occasionally produced solutions that technically worked but did not fit the project structure or course expectations. In those situations, blindly trusting the output usually created additional problems rather than solving them.

Because of that, I gradually learned that AI works best as a supplement to learning rather than a replacement for understanding concepts independently. The most effective workflow for me was using AI to accelerate exploration and debugging while still verifying the logic myself through testing, documentation, and experimentation.

Overall, AI improved my learning experience in ICS 314 by making complex concepts more approachable and helping me troubleshoot problems faster. However, it also reinforced the importance of critical thinking, verification, and understanding the reasoning behind generated solutions instead of simply copying answers directly.

## IV. Practical Applications and Challenges

One of the most practical benefits of AI during ICS 314 was the amount of time it saved during development and debugging. Software engineering projects often involve many small problems happening at the same time, such as syntax issues, framework behavior, routing problems, type mismatches, styling conflicts, or deployment failures. AI helped reduce the amount of time spent searching for possible causes by quickly suggesting explanations or solutions.

This was especially helpful during the UH GameLink final project. Many issues involved multiple technologies interacting together, including Next.js, React, Prisma, TypeScript, ESLint, Playwright, and authentication systems. In situations where I was unsure whether the problem came from the frontend, backend, framework configuration, or database logic, AI often helped narrow down the possibilities much faster than debugging completely alone.

For example, AI was useful when dealing with React hook errors, TypeScript prop mismatches, Prisma query failures, and Playwright testing issues. It also helped explain why certain fixes worked or why specific framework behaviors occurred. In several cases, AI-generated examples helped me understand how components, hooks, or routes were supposed to interact within the application.

However, AI also created challenges. One major issue was that generated solutions sometimes ignored the context of the existing project. A fix that worked in isolation could accidentally break other features that were already functioning correctly. During the Find Players page debugging process, broad AI-generated rewrites temporarily removed working features such as pagination and modal functionality even though the original issue was relatively small. That experience demonstrated how important it is to review generated code carefully before applying large changes.

Another challenge was that AI responses were not always consistent or accurate. Sometimes the generated code used outdated framework patterns, unnecessary complexity, or libraries that were not being used in the course. In other situations, the code technically worked but violated ESLint rules or did not follow the expected project structure. Because of that, I still needed to understand the underlying concepts well enough to evaluate whether the solution actually made sense.

AI also occasionally encouraged dependency. When facing frustrating bugs or deadlines, it was tempting to immediately ask AI for solutions rather than investigating the issue independently first. Over time, I learned that AI is most effective when used as a collaborative tool rather than a replacement for problem-solving.

Overall, the practical value of AI in ICS 314 was substantial. It accelerated debugging, improved workflow efficiency, and made unfamiliar concepts easier to approach. At the same time, the challenges showed that software engineering still requires judgment, testing, and understanding beyond simply generating code automatically.

## V. Challenges and Opportunities

One of the biggest challenges I encountered while using AI in ICS 314 was reliability. Although AI could often generate useful explanations or debugging suggestions quickly, the responses were not always correct or appropriate for the specific project context. Sometimes generated solutions introduced new bugs, ignored existing functionality, or used patterns that did not match the structure of the application.

This became especially noticeable during the UH GameLink project. In several situations, AI-generated rewrites solved one issue while accidentally breaking unrelated features such as pagination, modal functionality, or component behavior. Because of that, I learned that generated code still requires careful testing and verification before being trusted. AI can accelerate development, but it does not eliminate the need for debugging and critical thinking.

Another challenge involved overreliance. When facing difficult bugs or deadlines, it was tempting to immediately ask AI for solutions instead of investigating the problem independently first. While AI often saved time, relying on it too quickly sometimes weakened my own problem-solving process. I noticed that I learned concepts more effectively when I first attempted to understand the issue myself before using AI as assistance.

AI also occasionally struggled with course-specific expectations. Some generated code technically worked but violated ESLint rules, TypeScript conventions, or project constraints required in ICS 314. In other situations, the solutions were overly complicated for what the assignment actually required. This showed that AI-generated answers are not automatically aligned with the standards or style expectations of a particular course.

Despite these limitations, I believe there are many opportunities for AI to improve software engineering education. AI tools can provide immediate feedback, explain difficult concepts conversationally, and help students debug issues more efficiently. This is especially useful in courses like ICS 314 where students work with modern frameworks and large projects that can become overwhelming for beginners.

AI can also encourage independent learning. Instead of waiting for office hours or discussion responses, students can experiment with ideas and ask follow-up questions immediately. This makes learning more interactive and accessible, particularly when dealing with unfamiliar technologies such as React, Next.js, Prisma, or testing frameworks.

At the same time, I believe AI should be integrated carefully into software engineering education. Students still need to understand the reasoning behind solutions rather than simply copying generated code. Instructors may need to place greater emphasis on debugging ability, code comprehension, software design decisions, and critical evaluation of generated outputs instead of focusing only on syntax memorization.

Overall, AI creates both opportunities and challenges in software engineering education. It can dramatically improve efficiency and accessibility, but it also reinforces the importance of understanding concepts deeply enough to evaluate whether generated solutions are actually correct.

## VI. Comparative Analysis

Compared to traditional learning resources, AI provided a much faster and more interactive experience throughout ICS 314. Normally, when encountering a bug or unfamiliar concept, I would search documentation, Stack Overflow posts, YouTube tutorials, or older discussion threads. While those resources are still valuable, they often require significant time to search through and may not directly match the specific problem being encountered.

AI was different because it allowed me to ask highly specific questions and receive immediate responses tailored to my situation. Instead of searching through multiple unrelated examples, I could directly ask questions such as:

> “Why is this React hook causing a rendering issue?”
>
> “Why does this Playwright test fail even though the component appears on screen?”
>
> “What is wrong with this Prisma query?”

That level of interactivity made debugging and learning feel more engaging compared to traditional resources alone. Being able to ask follow-up questions immediately also helped maintain momentum while working through assignments and project issues.

In terms of knowledge retention, I found that traditional learning methods were still important. Reading documentation carefully, experimenting independently, and debugging manually often helped concepts stay in my memory longer than simply reading AI-generated explanations. AI was very effective for quickly understanding concepts or solving immediate issues, but deeper understanding usually came from actually applying the concepts myself through coding and debugging.

Traditional teaching methods also encouraged more independent problem-solving. Without AI assistance, I often spent longer analyzing errors and experimenting with solutions manually. While this process could be frustrating, it sometimes strengthened my understanding more than immediately receiving generated suggestions. AI made problem-solving faster, but there were situations where relying on it too quickly reduced the amount of independent reasoning I practiced.

For practical skill development, I think AI was extremely valuable. Software engineering is not only about memorizing syntax. It also involves debugging, integrating systems, reading unfamiliar code, and adapting to changing requirements. AI helped simulate a more realistic modern development environment where developers use tools to improve efficiency while still needing to evaluate the quality of solutions themselves.

At the same time, traditional methods remain necessary because AI-generated answers are not always reliable. Official documentation, experimentation, and instructor guidance are still important for verifying correctness and understanding best practices. Because of that, I believe the strongest learning approach combines both traditional teaching methods and AI-enhanced tools rather than relying completely on either one.

## VII. Future Considerations

I believe AI will continue becoming more integrated into software engineering education and professional development in the future. Based on my experience in ICS 314, AI tools are already capable of assisting with debugging, explaining concepts, generating examples, improving workflow efficiency, and helping developers learn unfamiliar technologies more quickly. As these systems continue improving, they will likely become a normal part of the software engineering process rather than something viewed as unusual or optional.

At the same time, I do not think AI will replace the need for software engineering knowledge or problem-solving ability. Throughout this course, I learned that AI-generated solutions still require human judgment, testing, and understanding. A generated answer may appear correct at first glance while still containing hidden bugs, incorrect assumptions, or design problems that only become visible later during integration or testing.

Because of that, I think future software engineering education will place greater emphasis on critical thinking, debugging ability, and evaluating generated outputs rather than memorizing syntax alone. Students will still need strong foundational knowledge in order to recognize when AI-generated solutions are incorrect, inefficient, insecure, or incompatible with the project requirements.

I also believe AI may change how students learn new technologies. Instead of relying only on static tutorials or documentation, future students will likely learn through more interactive conversations with AI systems that can explain concepts dynamically and respond to follow-up questions instantly. This could make difficult frameworks and software engineering concepts more approachable for beginners.

However, there are also important concerns that educators and students will need to address. Overreliance on AI could weaken independent problem-solving skills if students begin copying generated solutions without understanding them. In addition, questions about academic integrity, authorship, and responsible AI usage will likely become increasingly important as these tools become more powerful and accessible.

For me personally, ICS 314 changed how I view AI in software engineering. At the beginning of the semester, I mostly saw AI as a convenience tool for quick answers. By the end of the course, I viewed it more as a collaborative assistant that can accelerate learning and development while still requiring careful verification and understanding from the user.

Overall, I think the future of software engineering education will involve learning not only how to write code, but also how to work effectively and responsibly alongside AI tools.

## VIII. Conclusion

Reflecting on my experience in ICS 314, AI played a major role in how I learned, debugged, wrote, and improved code throughout the semester. It helped me understand unfamiliar concepts, work through WODs, improve essays, fix ESLint and TypeScript issues, and make progress on the UH GameLink final project. In many situations, AI made software engineering feel more approachable because I could ask direct questions and receive immediate explanations.

At the same time, this course also showed me the limits of AI. AI was helpful, but it was not always correct. Some generated solutions ignored the existing codebase, introduced new bugs, or overcomplicated problems that only needed small fixes. Because of that, I learned that AI should not be treated as a replacement for understanding. It works best when used as a tool for support, explanation, debugging, and organization.

The biggest lesson I learned is that using AI effectively still requires software engineering judgment. A developer needs to test the code, understand the logic, check whether the solution fits the project, and recognize when an answer is wrong. In that way, AI did not remove the need to learn software engineering. Instead, it made it even more important to understand what I was doing.

For future courses, I think AI should be integrated in a way that encourages responsible use. Students should be allowed to use AI for explanation, debugging, and feedback, but they should also be expected to reflect on how they used it and verify the results themselves. AI can be extremely useful in software engineering education, but only when paired with critical thinking, testing, and personal effort.

Overall, my experience with AI in ICS 314 was positive but realistic. It helped me a lot throughout the semester, but it also frustrated me at times and reminded me that there is no shortcut around actually understanding the work. AI became one of my most useful tools, but the responsibility for learning and building correctly still belonged to me.


*This essay reflects my personal experiences in ICS 314 and was written by me with moderate ChatGPT assistance for organization, wording, and reflection development.*
