# WorldChatter Addon Template!
## Here you can learn how to implement it in your plugin!

# Step 1
## You need to add the plugin as an external library in your project
### and make sure that you depend it in ur **"plugin.yml"**
![pluginyml.png](pluginyml.png)

"softdepend" or "depend" as you like ^^

# Step 2
## add this code to make it able to work and register the listener into any class you like!
```java
@Override
    public void onEnable() {
        WorldChatter main = (WorldChatter) Bukkit.getPluginManager().getPlugin("WorldChatter");

        main.getAPICore().addListener(this, new Listener());
    }
```
# Step 3
## in your new listener class add "implements WorldChatterAPI" on the class and add all the methods
```java
public class Listener implements WorldChatterAPI {
    @Override
    public void messageDetect(AsyncPlayerChatEvent asyncPlayerChatEvent, List<String> list) {
    } // asyncplayerevent is the chatevent and list are the flags when detected

    @Override
    public void chatLockToggle(CommandSender commandSender, boolean b) {
    } // boolean b checks if the chat is locked or not

    @Override
    public void updateChecked(boolean b) {
    } // if it's true means there is an update if it's false means there is not

    @Override
    public void configReload(CommandSender commandSender) {
    } // i mean you know now.
}
```

## and now you are ready to create an Addon!

# alternative step
## you can add the plugin via maven by adding the jar from jitpack.io
```xml
     <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependency>
	    <groupId>com.github.OmarOmar93</groupId>
	    <artifactId>WorldChatter</artifactId>
	    <version>c51a927e31</version>
	</dependency>
```
