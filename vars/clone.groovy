def call(String url, String branch){
   echo "Cloning from GitHub..."
    git url: "${url}", branch:"${branch}"
    echo "Cloned Succesfully!"
}
