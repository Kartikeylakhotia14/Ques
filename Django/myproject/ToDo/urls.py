from django.urls import path
from . import views
urlpatterns = [
    path('' , views.index,name ='index'),
    path('add',views.addtext,name='add'),
    path('complete/<id>',views.completeTodo,name ='complete'),
    path('deleteone',views.deleteone,name='deleteone'),
    path('deleteall',views.deleteall,name='deleteall')
]
