def call(project) {
    sh "kubectl -n prod rollout status deployment ${project}"
}
