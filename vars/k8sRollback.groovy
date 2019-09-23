def call(project) {
    sh "helm rollback ${project} 0 --tiller-namespace build"
    error "Failed production tests"
}
