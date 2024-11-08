const routes = [
  { path: '/', name: 'Home', component: () => import('../views/Home.vue') },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '/events',
    name: 'Events',
    component: () => import('../views/Events/AllEvents.vue')
  },
  {
    path: '/events/view/:id',
    name: 'Event',
    component: () => import('../views/Events/OneEvent.vue')
  },
  {
    path: '/events/create',
    name: 'Create Event',
    component: () => import('../views/Events/AddEvent.vue')
  },
  {
    path: '/events/edit/:id',
    name: 'Edit Event',
    component: () => import('../views/Events/EditEvent.vue')
  },
  {
    path: '/events/delete/:id',
    name: 'Delete Event',
    component: () => import('../views/Events/DeleteEvent.vue')
  },
  {
    path: '/:pathMatch(.*)*',
    name: 'Not Found',
    component: () => import('../views/NotFound.vue')
  }
  /* ,
  {
    path: '/Users',
    name: 'Users',
    component: () => import('../views/Users/AllUsers.vue')
  } */
]

export default routes
