package org.jraf.graphqlresume.htmlgenerator

// language=HTML
val HEAD = """
<link
  href="https://fonts.googleapis.com/css?family=Roboto:regular,medium,thin,light,italic,mediumitalic,thinitalic,lightitalic"
  rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet" type="text/css"/>
<style>
    @media print {
        @page {
            size: A4 portrait;
        }
        nav {
            display: none;
        }
        :root:lang(en) {
            font-size: 0.91rem;
        }
        :root:lang(fr) {
            font-size: 0.91rem;
        }
    }

    body {
        font-family: Roboto, sans-serif;
        width: 21cm;
        margin-left: auto;
        margin-right: auto;
        font-weight: 300;

    }

    nav {
        margin-bottom: 1em;
        font-size: 0.8rem;
    }

    nav ul {
        display: flex;
        justify-content: space-between;
    }

    nav ul li {
        display: inline;
    }

    address {
        font-style: normal;
    }

    address strong {
        font-weight: 400;
        font-size: 1.2rem;
    }

    h1 {
        text-align: center;
        text-transform: uppercase;
        text-decoration: underline;
        font-weight: 300;
        font-size: 1.7rem;
    }

    ul {
        list-style-type: ". ";
        list-style-position: outside;
        padding: 0px;
        margin: 0px;
    }

    li {
        margin-bottom: 0.3rem;
    }

    em {
        font-style: normal;
        text-decoration: underline;
    }

    footer em::after {
        content: ": ";
        text-decoration: none;
        font-style: normal;
        display: inline-block;
        white-space: pre;
    }

    footer em:lang(fr)::after {
        content: " : ";
    }
    
    section > header {
        background-color: #e8e8ff;
        text-align: center;
        padding: 0.2rem;
        font-size: 1.5rem;
        margin-top: 0.5rem;
        margin-bottom: 0.5rem;
        text-transform: uppercase;
    }

    article {
        display: grid;
        grid-template-columns: 7rem auto;
        padding-top: 0.7rem;
        padding-bottom: 0.7rem;
    }

    article header {
        margin-bottom: 0.4rem;
        font-weight: 400;
    }

    article footer {
        font-style: italic;
    }

    .addresses {
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .addresses address:last-child {
        text-align: right;
    }

    .company-details {
        font-family: 'Roboto Condensed', sans-serif;
        color: #888;
    }

    .section__skills > article {
        grid-template-columns: max-content auto;
        gap: 0.5rem;
    }

    .section__skills > article > header {
        text-decoration: underline;
    }

    .section__skills > article > header::after {
        content: ":";
        text-decoration: none;
        display: inline-block;
    }

    .section__skills ul {
        list-style-type: none;
    }
</style>
""".trimIndent()
