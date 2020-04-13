def call(project, addr) {
    sh """helm upgrade -i \
        ${project} \
        helm/${project} \
        --namespace prod \
        --set image.tag=${currentBuild.displayName} \
        --set ingress.host=${addr}"""
}
