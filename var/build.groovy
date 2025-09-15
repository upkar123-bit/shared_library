def call(string dockerhubuser, string tag, string projectname)
{
sh  "docker build -t ${projectname}/${dockerhubuser}: ${tag} . "
}
