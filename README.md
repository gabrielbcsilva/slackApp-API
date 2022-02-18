# Slack messages API
 A java application built to send messages(with a BotApp) in your Slack workspace using Web APIs. Indicated for team members.</p>
 [_Um aplicativo Java criado para enviar mensagens (com um BotApp) em seu espaço de trabalho Slack usando APIs da Web. Indicado para membros de equipe_].
 
 It's very common to see in a Development Team collaborative applications being used for helping in the internal communication between members. I decided to build this app because Slack is one of the most popular remote tools in the world and It is no secret that remote work tools are exploding in popularity as more and more people are required from home. This repository is just a guide I hope that you can start building your own slack app.


 <h3 align="center">
    <a  href="https://www.oracle.com/java/technologies/downloads/" >
    <img alt="Java" title="#java" width="170px" height="83px" src="https://marcas-logos.net/wp-content/uploads/2020/11/Java-logo.jpg"></a>
    <a  href="https://slack.com/intl/pt-br/">
    <img alt="Slack" title="#Slack" width="170px" height="83px"  src="https://assets.b9.com.br/wp-content/uploads/2019/01/slack_logo_2.png"></a>
</h3>
  

   <a href="https://github.com/gabriel-silva-kothe">
   <div align="center"> <img alt="Code by Gabriel Bruno" src="https://img.shields.io/badge/code%20by-Gabriel%20Bruno-red"></div>
  </a>
</p>


## Step by step

-  [Create a Slack App](https://api.slack.com/apps) </p>
<img alt="img1" src="./images/app.png">
-  [Add features and functionality](https://api.slack.com/apps) 
In my case I just needed to configure permissions and to add the app Boot in the workspace because I'll to manage the requisitions in the code.</p>
<img alt="img2"  src="./images/permissions.png">
-  [Bot Token Scopes](https://api.slack.com/apps) </p>
<img alt="img3"  src="./images/scopes.png">
-  [You'll need to Add this OAuth Scopes](https://api.slack.com/apps) </p>
<img alt="img4" src="./images/scopesall.png">
-  [Generate the token that will be used in the application(Bot User Token)](https://api.slack.com/apps) </p>
<img alt="img5" src="./images/tokens.png">
-  [Finally you'll need to install at your workspace this app](https://api.slack.com/apps) </p>
<img alt="img6"  src="./images/install.png">
-  [Let's code!](https://slack.dev/java-slack-sdk/guides/web-api-basics) </p>
<img alt="img7"  src="./images/javaapi.png"> 



## :interrobang: API Methods


Slack has a complete list of all the methods that you’ll be able to use, here. Each method has its own documentation page, that will provide everything you’ll need to start using it.  <a href="https://api.slack.com/start/overview">An introduction to the Slack platform </a>.


## *References*

- [The art of crafting a Slack app 
your team will love](https://slack.dev/guides/Build.pdf)
- [Building great user experiences
on Slack](https://slack.dev/guides/AppUIGuidelines.pdf)
- [Slack Api Overview](https://api.slack.com/start/overview)



<a id="como-contribuir"></a>

## :dart: Como contribuir(How can You contribute?)

- Faça um _Fork_ deste repositório;
- Crie uma _branch_ com a sua feature: `git checkout -b my-feature`
- _Commit_ suas mudanças: `git commit -m 'feat: My new feature'`
- Faça um _push_ da sua branch: `git push origin my-feature`
