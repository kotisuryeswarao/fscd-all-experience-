# Experiment 10: React Student Manager

## Overview
A React + Vite app demonstrating CRUD operations with React state management.
Features add and delete operations on a student list using `useState`.

## Project Structure
```
experiment10-student-manager/
├── src/
│   ├── StudentManager.jsx    (basic version — no CSS)
│   ├── StudentManager1.jsx   (styled version — used by App)
│   ├── StudentManager.css    (styles for StudentManager1)
│   ├── App.jsx
│   ├── App.css
│   ├── main.jsx
│   └── index.css
├── index.html
├── package.json
├── vite.config.js
├── eslint.config.js
├── .gitignore
└── README.md
```

## Features
- View list of students (ID, Name, Course)
- Add a new student via form
- Delete a student by clicking Delete button
- Form validation — all fields required

## Setup & Run
```bash
npm install
npm run dev
```
Open http://localhost:5173

## Push to GitHub
```bash
git init
git add .
git commit -m "Experiment 10: React Student Manager CRUD"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/experiment10-student-manager.git
git push -u origin main
```

## Technologies
React 19 · Vite 7 · CSS · ESLint
