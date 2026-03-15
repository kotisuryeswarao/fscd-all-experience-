# Experiment 11: React News Portal — API Integration

## Overview
A React + Vite news portal demonstrating three types of data fetching:
- **Local JSON** (`/public/users.json`) via `fetch()`
- **External REST API** (`jsonplaceholder.typicode.com`) via `fetch()`
- **Third-party API** (`dummyjson.com/posts`) via `axios` with filter

## Project Structure
```
experiment11-react-news-portal/
├── public/
│   └── users.json              (local user data)
├── src/
│   ├── components/
│   │   ├── Dashboard.jsx       (home with nav links)
│   │   ├── LocalUserList.jsx   (fetch from local JSON)
│   │   ├── UserList.jsx        (fetch from JSONPlaceholder API)
│   │   └── FakePostList.jsx    (axios + filter by userId)
│   ├── App.jsx                 (React Router routes)
│   ├── App.css                 (global styles)
│   ├── main.jsx                (entry point)
│   └── index.css
├── index.html
├── package.json
├── vite.config.js
├── eslint.config.js
├── .gitignore
└── README.md
```

## Routes
| Path | Component | Data Source |
|------|-----------|-------------|
| `/` | Dashboard | — |
| `/local-users` | LocalUserList | `/public/users.json` |
| `/users-api` | UserList | `jsonplaceholder.typicode.com/users` |
| `/fake-posts` | FakePostList | `dummyjson.com/posts` + axios |

## Setup & Run
```bash
npm install
npm run dev
```
Open http://localhost:5173

## Build for Production
```bash
npm run build
npm run preview
```

## Push to GitHub
```bash
git init
git add .
git commit -m "Experiment 11: React News Portal with API integration"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/experiment11-news-portal.git
git push -u origin main
```

## Technologies
React 19 · Vite 7 · React Router DOM 7 · Axios · ESLint
