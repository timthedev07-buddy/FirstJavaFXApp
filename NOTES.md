# Different panes
**Flow pane**
`FlowPane` positions node in a row or column based on the orientation value, where nodes are wrapped when they all cannot be shown. The default orientation of a flow pane is `Orientation.HORIZONTAL`
```java
// Initialize a flow pane that lays components
// vertically and has a certain value of horizontal gap and vertical gap.
import javafx.scene.layout.FlowPane;
FlowPane flowPain = new FlowPane(Orientation.VERTICAL, hgap, vgap)
```