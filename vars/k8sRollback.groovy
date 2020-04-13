def call(project) {
    sh "helm --namespace prod rollback ${project} 0"
    error "Failed production tests"
}
