---
layout: essay
type: essay
title: "UI Frameworks: Painful at First, Worth It Later"
date: 2026-02-19
published: true
labels:
  - Bootstrap 5
  - UI Frameworks
  - Software Engineering
---

<img width="300px" class="rounded float-start pe-4" src="../img/ui-frameworks/bootstrap-example.png">

## The Part Nobody Talks About

I’ll be honest: learning a UI framework felt like a pain in the ass at first.

When we started using Bootstrap 5, it slowed me down a lot compared to just writing raw CSS. Instead of styling things directly, I had to remember class names for spacing, layout, flex behavior, breakpoints, alignment, and more. It felt like extra steps for something I already knew how to do.

During timed WODs, that frustration was even worse. I would finish the layout logic in my head, but then spend extra minutes adjusting classes and figuring out why something wasn’t aligning correctly. At that point, it honestly felt like Bootstrap was getting in the way.

So naturally, I wondered: why not just use HTML and CSS?

## Why It Started Making Sense

The turning point came after a few rebuild exercises. Something clicked.

Instead of fighting the grid system, I started thinking in terms of rows and columns automatically. Instead of writing custom media queries, I could use something like:

```html
<div class="row">
  <div class="col-md-4">...</div>
  <div class="col-md-4">...</div>
  <div class="col-md-4">...</div>
</div>
```

And the responsiveness was handled for me.

Once I got used to the patterns, my speed increased. I wasn’t slower anymore. I was faster. Layout became more predictable. I didn’t have to constantly tweak margins or test breakpoints manually.

What originally felt like overhead started feeling like structure.

## Higher Quality With Less Effort

One thing I didn’t expect was how much cleaner my pages looked.

Using Bootstrap made my layouts more consistent. Spacing felt balanced. Components lined up properly. Responsive behavior worked without me having to debug it for an hour.

Could I have built those pages with pure CSS? Yes.

Would it have taken longer? Definitely.

Bootstrap didn’t remove my need to understand CSS. In fact, understanding CSS made Bootstrap easier to use. But it gave me a system. And that system helped me build higher-quality pages more efficiently.

## The Software Engineering Side

Beyond convenience, I started noticing the software engineering benefits.

Frameworks promote consistency. When multiple developers use the same system, layout decisions aren’t random. There’s a shared structure. When you see `navbar`, `container`, or `card`, you already know what’s happening.

That makes code easier to read and maintain.

It also reduces unnecessary decisions. I don’t have to think about exact pixel margins every time. I can rely on utility classes. That frees up mental energy to focus on functionality instead of micromanaging layout details.

This is especially important in team environments. Code is read more than it is written. A standardized system helps everyone move faster.

## CSS Still Matters

That said, CSS is still important.

If someone uses a UI framework without understanding CSS, customization becomes painful. Frameworks are not replacements for knowledge. They are tools built on top of core principles.

Raw HTML and CSS give you full control. For highly custom designs or unique branding, frameworks can feel limiting. And if someone blindly copies Bootstrap components without understanding them, sites can start looking generic.

But in practice, UI frameworks are becoming the standard for a reason. They provide structure, responsiveness, and consistency out of the box.

## Final Thoughts

Learning Bootstrap was frustrating at first. It slowed me down. It forced me to adjust how I think about layout.

But over time, it increased my speed and improved the quality of my work.

UI frameworks are not shortcuts. They are structured systems. They require an initial investment of time and patience. Once you get used to them, they make building modern, responsive websites much more efficient.

I still value CSS. But now I see UI frameworks as good practice and, in many cases, the smarter default choice.

Sometimes the tools that feel slow at the beginning are the ones that scale best later.

---

*I used ChatGPT to assist with drafting and refining this essay. The experiences and opinions expressed are based on my own work using Bootstrap 5 during this semester.*
