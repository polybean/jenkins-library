def call(project) {
    sh "kubectl -n build rollout status deployment ${project}"
}
