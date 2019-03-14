from django.shortcuts import render,redirect
from django.views.decorators.http import require_POST
from .models import ToDo
from .forms import ToDoForm
# Create your views here.
def index(request):
    todo_list = ToDo.objects.order_by('id')
    form = ToDoForm()
    content ={'todo_list':todo_list,'form':form}
    return render(request,"ToDo/index.html" ,content)

@require_POST
def addtext(request):
    form = ToDoForm(request.POST)

    if form.is_valid():
        new_todo = ToDo(text = request.POST['text'])
        new_todo.save()

    return redirect('index')

def completeTodo(request, id):
    todo = ToDo.objects.get(pk =id)
    todo.complete = True
    todo.save()

    return redirect('index')
def deleteone(request):
    ToDo.objects.filter(complete__exact=True).delete()

    return redirect('index')

def deleteall(request):
    ToDo.objects.all().delete()

    return redirect('index')
