#A ruby program that renders an HTML document
#to the console

node ={
    tag: "p",
    text: "this is a paragraph"
}
html = {
    tag: "div",
    children: [node]
}
def render(node)
    if node[:tag] == "p"
        puts node[:text]
    elsif node[:tag] == "div"
        children = node[:children]
        puts children.each {|child| render(child)}
    end
end
render(html)